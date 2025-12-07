# Java Search Engine

A simple web search engine built in Java that crawls web pages and performs text-based searches using TF-IDF scoring and PageRank algorithms.

## Features

- **Web Crawler**: Crawls web pages starting from a seed URL using breadth-first search
- **Search Engine**: Performs searches using TF-IDF (Term Frequency-Inverse Document Frequency) and cosine similarity
- **PageRank**: Optional PageRank boosting for improved search result ranking
- **GUI**: JavaFX-based graphical user interface for searching

## How It Works

1. The crawler starts from a seed URL and traverses web pages, extracting text content and links
2. TF-IDF scores are calculated for each word in each crawled page
3. PageRank values are computed based on the link structure between pages
4. Users can search through crawled pages, with results ranked by relevance (and optionally boosted by PageRank)