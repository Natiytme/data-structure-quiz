def del_elm(arr, idx):
    if idx < 0 or idx >= len(arr):
        print("Invalid index.")
        return arr

    new_arr = [0] * (len(arr) - 1)
    new_idx = 0
    for i in range(len(arr)):
        if i != idx:
            new_arr[new_idx] = arr[i]
            new_idx += 1

    return new_arr

del_elm()