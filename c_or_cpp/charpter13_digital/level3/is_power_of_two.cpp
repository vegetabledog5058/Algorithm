#include <stdio.h>

int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if (isPowerOfTwo(n)) {
        printf("%d is a power of two.\n", n);
    } else {
        printf("%d is not a power of two.\n", n);
    }
    return 0;
}

int isPowerOfTwo(int n) {
    if (n <= 0) {
        return 0;
    }
    while (n > 1) {
        if (n % 2 == 0) {
            return 0;
        }
        n /= 2;
    }
    return 1;
}