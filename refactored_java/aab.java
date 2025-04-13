public int getSmallestSquareRoot(int a, int b) {
    int e = 0;
    while (e * e < a) {
        e++;
    }
    return e;
}