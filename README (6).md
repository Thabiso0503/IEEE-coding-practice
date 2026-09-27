# Problem 3: Matrix Exploration

## Overview

Given a grid with accessible cells, forbidden cells, and several special cells, calculate the shortest distance from every accessible cell to its nearest special cell and output the total distance.

## Approach

Use **Multi-Source Breadth-First Search (BFS)**. All special cells are placed in the queue initially with distance `0`. BFS then expands from all special cells at the same time, so the first distance assigned to a cell is its shortest distance to any special cell.

## Concepts

- Breadth-First Search (BFS)
- Multi-source graph traversal
- Queues
- Grid traversal
- Shortest paths
- Efficient input handling

## Complexity

**Time:** `O(N × M)`  
**Space:** `O(N × M)`
