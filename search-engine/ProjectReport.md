# COMP 1406Z - Search Engine Project Report

## 1. Instructions for Running the GUI and Tests

### Running the GUI Application

1. **Compile the project**: Ensure all Java files are compiled with JavaFX on the classpath:
   ```bash
   javac -cp "lib/*:src" -d bin src/*.java
   ```

2. **Run the application**: Execute the `App` class:
   ```bash
   java -cp "lib/*:bin" App
   ```

3. **Before searching**: You must first crawl a website to generate search data. This can be done either:
   - Through the `ProjectTesterImp` class (for automated testing)
   - By running the `Crawler` class directly (see instructions below)

4. **Running the Crawler directly**: To crawl a website and generate search data, you can run the `Crawler` class with a URL as a command-line argument:
   ```bash
   java -cp "lib/*:bin" Crawler "https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-0.html"
   ```
   
   Simply copy and paste any seed URL after the `Crawler` command. If no URL is provided, it defaults to `tinyfruitsA`.
   
   **Example commands**:
   ```bash
   # Crawl tiny dataset (10 pages)
   java -cp "lib/*:bin" Crawler "https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-0.html"
   
   # Crawl 25-page dataset
   java -cp "lib/*:bin" Crawler "https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html"
   
   # Crawl 50-page dataset
   java -cp "lib/*:bin" Crawler "https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html"
   
   # Crawl 100-page dataset
   java -cp "lib/*:bin" Crawler "https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html"
   
   # Crawl larger dataset
   java -cp "lib/*:bin" Crawler "https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html"
   ```
   
   After crawling completes, the data will be saved in the `crawlResults/` directory and you can use the GUI to search.

5. **Controller**: The controller class is `SearchController`, which is instantiated in the `App` class's `start()` method. The controller coordinates between the `GUI` (view) and `SearchEngine` (model).

### Running Automated Tests

To run the provided test suite:

1. **Place test files**: Copy all test Java files (e.g., `TinyFruitsATFTester.java`, `Fruits25SearchBoostTester.java`, etc.) into the `src/` directory of your project.

2. **Place expected results files**: Copy all expected results `.txt` files (e.g., `TinyFruitsA-expected-search-results.txt`, `Fruits25-expected-search-results.txt`, etc.) into the **project root directory** (the same directory where `src/`, `lib/`, and `bin/` folders are located). These files are required for search tests to compare your results against expected outputs.

3. **Compile tests**: Compile all Java files including the test files:
   ```bash
   javac -cp "lib/*:src" -d bin src/*.java
   ```

4. **Run individual tests**: Run each test file from the project root directory. For example:
   ```bash
   java -cp "lib/*:bin" TinyFruitsATFTester
   java -cp "lib/*:bin" Fruits25SearchBoostTester
   java -cp "lib/*:bin" Fruits50PageRanksTester
   ```
   (Replace with the actual test class names you want to run)

5. **Check results**: After running each test, check the generated output files:
   - `*-passed.txt` files contain tests that passed
   - `*-failed.txt` files contain tests that failed with detailed error information
   
   These output files will be created in the **project root directory** where you ran the test command.

**Important Notes**:
- Test files must be in the `src/` directory to be compiled
- Expected results `.txt` files must be in the **project root directory** (not in `src/`)
- Output files (`*-passed.txt` and `*-failed.txt`) will be created in the **project root directory**
- Make sure `TestingTools.java` is also in your `src/` directory (it's required by the test files)

## 2. Functionality Status

### Successfully Completed Functionality

- ✅ **Web Crawling**: Full BFS-based web crawler that traverses pages starting from a seed URL
- ✅ **HTML Parsing**: Extracts titles, links, and words from HTML content
- ✅ **Link Graph Construction**: Builds both outgoing and incoming link graphs
- ✅ **PageRank Calculation**: Implements iterative PageRank algorithm with damping factor
- ✅ **TF-IDF Calculation**: Computes term frequency, inverse document frequency, and TF-IDF scores
- ✅ **Search Functionality**: Performs cosine similarity-based search with optional PageRank boost
- ✅ **Data Persistence**: Saves all crawl data to serialized files for later use
- ✅ **GUI Application**: Complete MVC-based GUI with search field, PageRank boost toggle, and results display
- ✅ **ProjectTesterImp**: Full implementation of the `ProjectTester` interface for automated testing
- ✅ **Empty Query Handling**: Returns top 10 results with score 0 sorted lexicographically when query has no valid words
- ✅ **Zero Magnitude Query Handling**: Handles queries where all words have IDF=0
- ✅ **OS-Agnostic File Paths**: Uses `File.separator` for cross-platform compatibility

### Functionality That Does Not Work

- ❌ None identified - all core functionality is implemented and working

**Note**: The GUI requires crawl data to be present before searches can return meaningful results. If no crawl has been performed, searches will return empty results.

## 3. Class and Interface Outline

### Core Application Classes

**`App.java`**
- **Responsibility**: Main application entry point and MVC architecture setup
- **Key Features**: Extends JavaFX `Application`, creates and wires together Model (`SearchData`, `SearchEngine`), View (`GUI`), and Controller (`SearchController`) components
- **Why**: Centralizes application initialization and ensures proper MVC separation

**`GUI.java`**
- **Responsibility**: View component in MVC pattern - handles all user interface elements
- **Key Features**: Extends `Pane`, implements `SearchView`, contains search field, boost toggle, and results list
- **Why**: Separates UI concerns from business logic, making the code more maintainable and testable

**`SearchController.java`**
- **Responsibility**: Controller in MVC pattern - handles user input and coordinates model-view communication
- **Key Features**: Receives search requests from view, delegates to model, updates view with results
- **Why**: Decouples view from model, allowing changes to either without affecting the other

**`SearchEngine.java`**
- **Responsibility**: Model component - performs search calculations and ranking
- **Key Features**: Calculates cosine similarity, applies PageRank boost, sorts and filters results
- **Why**: Encapsulates search logic, making it reusable and testable independently of the GUI

**`SearchData.java`**
- **Responsibility**: Manages search data loaded from serialized files with lazy loading
- **Key Features**: Loads data on-demand, caches loaded data, provides accessor methods for all search data
- **Why**: Efficient memory usage - only loads data when needed, and caches to avoid repeated file I/O

**`SearchResult.java`**
- **Responsibility**: Represents a single search result with title and score
- **Key Features**: Immutable data class with getters for title and score
- **Why**: Simple data transfer object that encapsulates result information

### Crawling Classes

**`Crawler.java`**
- **Responsibility**: Web crawler that traverses web pages using BFS algorithm
- **Key Features**: Performs BFS traversal, extracts HTML content, builds link graphs, calculates PageRank and TF-IDF, saves results
- **Why**: Centralizes all crawling logic, uses composition to delegate parsing and calculations to specialized classes

**`HtmlParser.java`**
- **Responsibility**: Parses HTML content to extract titles, links, and words
- **Key Features**: Implements `HtmlContentParser` interface, extracts data from HTML tags
- **Why**: Separates parsing logic, allows for different parser implementations through polymorphism

**`PageRankCalculator.java`**
- **Responsibility**: Calculates PageRank values for web pages
- **Key Features**: Iterative algorithm with damping factor, converges when Euclidean distance < 0.0001
- **Why**: Isolated calculation logic, reusable and testable independently

**`TfIdfCalculator.java`**
- **Responsibility**: Calculates TF-IDF scores for words across documents
- **Key Features**: Computes TF, IDF, and TF-IDF using logarithmic formulas
- **Why**: Separates TF-IDF calculation logic, follows single responsibility principle

**`UrlUtils.java`**
- **Responsibility**: Utility class for URL manipulation
- **Key Features**: Converts relative URLs to absolute URLs
- **Why**: Centralizes URL logic, prevents code duplication

### Data Storage Classes

**`DataStorage.java`**
- **Responsibility**: Interface defining contract for data storage operations
- **Key Features**: Defines methods for reading, writing, and clearing storage
- **Why**: Enables polymorphism - allows different storage implementations (file-based, database, etc.)

**`FileDataStorage.java`**
- **Responsibility**: File-based implementation of `DataStorage` interface
- **Key Features**: Uses Java object serialization to save/load data
- **Why**: Concrete implementation demonstrating interface usage, handles file I/O operations

**`DataSerializer.java`**
- **Responsibility**: Handles serialization/deserialization operations
- **Key Features**: Wraps file operations for backward compatibility
- **Why**: Provides a simpler interface for serialization operations

### Testing Classes

**`ProjectTesterImp.java`**
- **Responsibility**: Implements `ProjectTester` interface for automated testing
- **Key Features**: Provides methods for crawling, getting links, PageRank, TF-IDF, and searching
- **Why**: Acts as a bridge between automated tests and the actual implementation

**`ProjectTester.java`**
- **Responsibility**: Interface provided by course - defines testing contract
- **Key Features**: Defines required methods for automated testing
- **Why**: Standard interface ensuring compatibility with test suite

### Supporting Classes

**`WebRequester.java`**
- **Responsibility**: Fetches HTML content from URLs (provided by course)
- **Key Features**: Reads web page content as string
- **Why**: Provided class, handles network requests

**`WebFetcher.java`**
- **Responsibility**: Alternative web fetching implementation (if used)
- **Key Features**: May provide different fetching mechanism
- **Why**: Demonstrates flexibility in implementation

**`SearchView.java`**
- **Responsibility**: Interface for view components in MVC pattern
- **Key Features**: Defines methods for displaying results and setting controller
- **Why**: Enables polymorphism - allows different view implementations

**`HtmlContentParser.java`**
- **Responsibility**: Interface for HTML parsing operations
- **Key Features**: Defines contract for extracting titles, links, and words
- **Why**: Enables polymorphism - allows different parser implementations

## 4. Overall Design Discussion

### Object-Oriented Programming Principles Applied

#### 1. Encapsulation
Encapsulation is demonstrated throughout the project:
- **Private fields**: All classes use private fields with public getters/setters where appropriate
- **Data hiding**: Internal implementation details are hidden (e.g., `Crawler`'s inner classes `CrawlData` and `TfIdfData`)
- **Why**: Prevents external code from directly modifying internal state, reducing bugs and making code more maintainable

**Example**: `SearchData` encapsulates data loading logic - external code doesn't need to know about file I/O or caching mechanisms.

#### 2. Inheritance
Inheritance is used appropriately:
- **`GUI extends Pane`**: GUI inherits JavaFX Pane functionality
- **`App extends Application`**: App inherits JavaFX Application lifecycle
- **Why**: Reuses existing functionality rather than reimplementing it, following DRY (Don't Repeat Yourself) principle

#### 3. Polymorphism
Polymorphism is demonstrated through interfaces:
- **`HtmlParser implements HtmlContentParser`**: Can be swapped with other parser implementations
- **`FileDataStorage implements DataStorage`**: Can be replaced with database or other storage implementations
- **`GUI implements SearchView`**: View can be replaced with different UI implementations
- **Why**: Makes code flexible and extensible - new implementations can be added without modifying existing code

**Example**: If we wanted to add a database storage option, we could create `DatabaseStorage implements DataStorage` without changing `SearchData` or `Crawler`.

#### 4. Abstraction
Abstraction is achieved through interfaces:
- **`DataStorage`**: Abstracts storage operations from implementation details
- **`HtmlContentParser`**: Abstracts parsing operations
- **`SearchView`**: Abstracts view operations
- **Why**: Defines contracts that implementations must follow, making code more modular and testable

#### 5. Composition
Composition is used extensively:
- **`Crawler` composes**: `HtmlContentParser`, `PageRankCalculator`, `TfIdfCalculator`, `DataStorage`
- **`SearchEngine` composes**: `SearchData`
- **`SearchController` composes**: `SearchEngine` and `SearchView`
- **Why**: Promotes code reuse and modularity - classes delegate responsibilities to specialized components

**Example**: `Crawler` doesn't need to know how PageRank is calculated - it delegates to `PageRankCalculator`, making the code more maintainable.

### Design Patterns

#### Model-View-Controller (MVC)
The GUI application follows the MVC pattern:
- **Model**: `SearchEngine` and `SearchData` - contain business logic and data
- **View**: `GUI` - displays UI and receives user input
- **Controller**: `SearchController` - coordinates between model and view

**Why MVC?**
- **Separation of Concerns**: Each component has a single, well-defined responsibility
- **Maintainability**: Changes to UI don't affect business logic and vice versa
- **Testability**: Each component can be tested independently
- **Extensibility**: New views or models can be added without modifying existing code

**Example**: If we wanted to add a command-line interface, we could create a new `CLIView implements SearchView` without changing `SearchController` or `SearchEngine`.

### Data Storage Design

#### Serialization Approach
Data is saved using Java object serialization:
- **Files saved**: `tf.ser`, `idf.ser`, `tfidf.ser`, `pageRank.ser`, `links.ser`, `linksi.ser`, `titles.ser`
- **Location**: `crawlResults/` directory (relative path)
- **Format**: Binary serialized Java objects

**Why serialization?**
- **Simplicity**: Java's built-in serialization handles complex data structures automatically
- **Type Safety**: Maintains type information, avoiding parsing errors
- **Performance**: Binary format is faster than text-based formats for complex nested structures
- **Persistence**: Allows crawler to run once, then perform multiple searches without re-crawling

**Why this approach over alternatives?**
- **JSON/XML**: Would require custom parsing code and lose type information
- **Database**: Overkill for this project, adds unnecessary complexity
- **Text files**: Would require custom parsing and be error-prone for nested structures

**File Structure**:
```
crawlResults/
  ├── page0.txt, page1.txt, ... (HTML content)
  ├── tf.ser (term frequency)
  ├── idf.ser (inverse document frequency)
  ├── tfidf.ser (TF-IDF scores)
  ├── pageRank.ser (PageRank values)
  ├── links.ser (outgoing links)
  ├── linksi.ser (incoming links)
  └── titles.ser (page titles)
```

**Lazy Loading**: `SearchData` uses lazy loading - data is only loaded from files when first accessed, then cached. This improves performance by avoiding unnecessary file I/O.

### Efficiency Improvements

Several design decisions improve efficiency:

1. **Lazy Loading in SearchData**: Data is loaded only when needed, not at construction time. This means if a user only calls `getPageRank()`, other data structures aren't loaded unnecessarily.

2. **Data Caching**: Once loaded, data is cached in memory, avoiding repeated file I/O operations during search.

3. **Early Returns**: Search method returns early if URLs list is empty or query has no valid words, avoiding unnecessary calculations.

4. **Efficient Data Structures**: 
   - `LinkedHashMap` preserves insertion order for consistent results
   - `HashSet` for O(1) lookup when checking visited URLs
   - `ArrayList` for ordered collections where needed

5. **Single Pass Calculations**: TF-IDF calculations are done in single passes where possible, reducing time complexity.

6. **Filtered Link Graph**: Link graph is filtered to only include visited pages before PageRank calculation, reducing computation.

### Design Decisions and Rationale

#### Why Interfaces Instead of Abstract Classes?
Interfaces were chosen over abstract classes because:
- **Multiple Inheritance**: Java classes can implement multiple interfaces but extend only one class
- **Flexibility**: Classes can implement interfaces without being forced into an inheritance hierarchy
- **Lighter Weight**: Interfaces don't carry implementation baggage
- **Example**: `GUI` extends `Pane` AND implements `SearchView` - couldn't do this with abstract classes

#### Why Composition Over Inheritance?
Composition is preferred for relationships like "has-a" rather than "is-a":
- **Flexibility**: Can change implementations at runtime
- **Loose Coupling**: Components are less dependent on each other
- **Example**: `Crawler` composes `HtmlParser` - if we needed a different parser, we could swap it without changing `Crawler`'s structure

#### Why Inner Classes?
`Crawler` uses inner classes (`CrawlData`, `TfIdfData`):
- **Encapsulation**: These classes are only used within `Crawler`, so they shouldn't be public
- **Organization**: Groups related data structures together
- **Access Control**: Inner classes can access private members of outer class

#### Why Separate Calculator Classes?
`PageRankCalculator` and `TfIdfCalculator` are separate classes:
- **Single Responsibility**: Each class has one job
- **Reusability**: Can be used independently or in different contexts
- **Testability**: Easier to test calculation logic in isolation

### Modularity and Extensibility

The design promotes modularity:
- **Clear Boundaries**: Each class has a well-defined responsibility
- **Low Coupling**: Classes depend on interfaces, not concrete implementations
- **High Cohesion**: Related functionality is grouped together

The design is extensible:
- **New Storage**: Can add new `DataStorage` implementations without changing existing code
- **New Parsers**: Can add new `HtmlContentParser` implementations
- **New Views**: Can add new `SearchView` implementations
- **New Features**: Can extend functionality without modifying core classes

### Conclusion

This project demonstrates solid object-oriented design principles. The use of interfaces enables polymorphism and flexibility, composition promotes code reuse, and encapsulation protects internal state. The MVC pattern separates concerns effectively, making the code maintainable and testable. The serialization approach provides efficient data persistence, and lazy loading optimizes performance. Overall, the design balances simplicity with extensibility, making it suitable for an introductory OOP course while demonstrating professional software engineering practices.

