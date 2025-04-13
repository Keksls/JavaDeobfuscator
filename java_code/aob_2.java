/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aob
 */
public final class aob_2 {
    private aob_2() {
    }

    public static int a(aoc_2 aoc_22, aoc_2 aoc_23) {
        return Math.max(0, aob_2.c(aoc_22, aoc_23) - 1);
    }

    public static int b(aoc_2 aoc_22, aoc_2 aoc_23) {
        return Math.abs(aoc_22.G() - aoc_23.G()) + Math.abs(aoc_22.H() - aoc_23.H());
    }

    public static int c(aoc_2 aoc_22, aoc_2 aoc_23) {
        int n = aoc_22.X() + aoc_23.X();
        int n2 = Math.max(0, Math.abs(aoc_22.G() - aoc_23.G()) - n);
        int n3 = Math.max(0, Math.abs(aoc_22.H() - aoc_23.H()) - n);
        return n2 + n3;
    }

    public static int a(aoc_2 aoc_22, aff_1 aff_12) {
        return Math.max(0, aob_2.c(aoc_22, aff_12) - 1);
    }

    public static int b(aoc_2 aoc_22, aff_1 aff_12) {
        return Math.abs(aoc_22.G() - aff_12.d()) + Math.abs(aoc_22.H() - aff_12.e());
    }

    public static int c(aoc_2 aoc_22, aff_1 aff_12) {
        int n = Math.max(0, Math.abs(aoc_22.G() - aff_12.d()) - aoc_22.X());
        int n2 = Math.max(0, Math.abs(aoc_22.H() - aff_12.e()) - aoc_22.X());
        return n + n2;
    }

    public static int a(aoc_2 aoc_22, int n, int n2) {
        int n3 = Math.max(0, Math.abs(aoc_22.G() - n) - aoc_22.X());
        int n4 = Math.max(0, Math.abs(aoc_22.H() - n2) - aoc_22.X());
        return n3 + n4;
    }
}

