def search():
    try:
        array = list(map(int, input("Enter numbers separated by space: ").split()))
        num = int(input("Enter the number to be searched: "))
    except ValueError:
        print("Invalid input. Please enter only integers.")
        return

    num_counts = {i: array.count(i) for i in array}

    if num in num_counts:
        print(f"The number {num} appears {num_counts[num]} times.")
    else:
        print(f"The number {num} does not appear in the array.")

search()