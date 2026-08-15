def findLargestOddSubstring(num: str):
    # Traverse from right to left to find the first odd digit
    for i in range(len(num) - 1, -1, -1):
        if int(num[i]) % 2 != 0:
            print(num[: i + 1])
            return
    print("-1")

if __name__ == "__main__":
    import sys
    input_data = sys.stdin.read().strip()
    if input_data:
        findLargestOddSubstring(input_data)