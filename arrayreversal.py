def reverse_array(array):
    start = 0
    end = len(array) - 1

    while start < end:
        # Swap elements at start and end positions
        array[start], array[end] = array[end], array[start]

        # Move the start and end pointers towards the center
        start += 1
        end -= 1

# Example usage
array = [1, 2, 3, 4, 5]
print("Original array:")
print(array)

reverse_array(array)

print("Reversed array:")
print(array)
