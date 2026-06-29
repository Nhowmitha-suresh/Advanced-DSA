# Memory Contiguity Conundrum

## Introduction

A flattened **1D array** stores all elements in one continuous block of memory. When elements are accessed one after another, the CPU can read them much faster because they are stored next to each other. In contrast, `vector<vector<int>>` and `int**` store rows separately, which makes memory access slower.

<img width="1099" height="1600" alt="image" src="https://github.com/user-attachments/assets/a25d03a4-49aa-4774-8be1-f4032ddcfe78" />
<img width="1291" height="1600" alt="image" src="https://github.com/user-attachments/assets/560bb089-99c4-4a15-8954-8b556397311a" />


## Contiguous Memory

In a 1D array, all elements are placed continuously in memory. This allows the processor to access consecutive elements without jumping to different memory locations. As a result, sequential traversal becomes faster and more efficient.

## CPU Cache Lines

Modern processors use cache memory to speed up data access. When one element of a contiguous array is loaded, nearby elements are also loaded into the cache. Therefore, the next few accesses are much faster because the required data is already available.

## Spatial Locality

Spatial locality means that if a program accesses one memory location, it is likely to access nearby locations next. A contiguous array naturally follows this pattern, allowing the CPU to reuse cached data and reduce memory access time.

## Hardware Prefetching

Processors can recognize sequential access patterns and automatically load the next block of data before it is requested. Since a 1D array is stored continuously, hardware prefetching works efficiently and improves overall performance.

## Pointer Chasing

In `vector<vector<int>>` or `int**`, each row may be stored at different memory locations. The processor must first read a pointer to find the next row before accessing its data. This extra pointer lookup, called **pointer chasing**, increases memory access time and reduces performance.

## Conclusion

A flattened 1D array is preferred for sequential processing because it provides better cache utilization, improves spatial locality, enables efficient hardware prefetching, and eliminates pointer chasing. These advantages reduce memory latency and make programs execute faster, especially in performance-critical applications such as scientific computing, graphics processing, and high-frequency trading.

## References

* Intel® Advisor – Optimize Memory Access Patterns
  https://www.intel.com/content/www/us/en/docs/advisor/cookbook/2023-1/optimize-memory-access-patterns.html

* Cornell Virtual Workshop – Data Locality Matters
  https://cvw.cac.cornell.edu/code-optimization/data-locality/data-locality-matters

* Game Programming Patterns – Data Locality
  https://gameprogrammingpatterns.com/data-locality.html
