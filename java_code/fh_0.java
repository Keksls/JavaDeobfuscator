/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Fh
 */
public class fh_0
implements Fm {
    private final FW a;

    public fh_0(FW fW) {
        this.a = fW;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(gh_0 gh_02) {
        try {
            void var5_10;
            gh_02.a(this.a.a());
            gh_02.a(this.a.e());
            if (this.a.h(64)) {
                gh_02.a(this.a.b());
            }
            gh_02.a(this.a.c());
            gh_02.a(this.a.d());
            int[] nArray = this.a.j();
            gh_02.a((short)nArray.length);
            int[] objectArray = nArray;
            int objectArray2 = objectArray.length;
            boolean bl = false;
            while (var5_10 < objectArray2) {
                int n = objectArray[var5_10];
                gh_02.a(n);
                ++var5_10;
            }
            short[] sArray = this.a.l();
            gh_02.a((short)sArray.length);
            for (int n : sArray) {
                gh_02.a((short)n);
            }
            short[] sArray2 = this.a.m();
            gh_02.a((short)sArray2.length);
            for (short s2 : sArray2) {
                gh_02.a(s2);
            }
            fg_0.a(gh_02, this.a.k().b());
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite " + this.a.b(), iOException);
        }
    }
}

