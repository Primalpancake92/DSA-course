class Main: 
    def insertion_sort(arr: list[int]):
        n = len(arr)
        for i in range(1, n):
            insert_index = i
            current_el = arr[i]
            for j in range(i-1, -1, -1):
                if arr[j] > current_el:
                    arr[j+1] = arr[j]
                    insert_index = j
                else:
                    break

            arr[insert_index] = current_el

    
    if __name__ == "__main__":
        some_array = [90, 70, 50, 30, 10]

        print("Original Array: ", some_array)
        
        insertion_sort(some_array)

        print("Sorted array: ", some_array)
