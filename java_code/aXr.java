/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.stream.IntStream;

public class aXr
extends aXj {
    private int a;
    private final byte b;

    public aXr(byte by) {
        this.b = by;
    }

    public aXr(byte by, int n) {
        this.a = n;
        this.b = by;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        if (this.b != 1 || IntStream.of(fbc_0.a.b()).noneMatch(n -> n == this.a)) {
            aXr.c();
            return;
        }
        if (azu_0.j().k() == null) {
            return;
        }
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aXr.c("This command requires you to be connected.");
            return;
        }
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)40);
        pt.a(this.a);
        aaw_22.c(pt);
    }

    private static void c() {
        int[] nArray = fbc_0.a.b();
        aXr.a("nationChange <nationId> : set nation of current character. Ids are " + Arrays.toString(nArray));
    }
}

