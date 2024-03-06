def find_divisors(n):
    divisors = [1]
    for i in range(2, n // 2 + 1):
        if n % i == 0:
            divisors.append(i)
    return divisors

def is_perfect_number(n):
    divisors = find_divisors(n)
    if sum(divisors) == n:
        return divisors
    else:
        return None

def main():
    while True:
        n = int(input())
        if n == -1:
            break
        
        divisors = is_perfect_number(n)
        if divisors:
            print(f"{n} =", " + ".join(map(str, divisors)))
        else:
            print(f"{n} is NOT perfect.")

if __name__ == "__main__":
    main()
