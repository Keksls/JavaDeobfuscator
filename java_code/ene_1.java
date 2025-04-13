/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eNe
 */
public class ene_1
implements Iterable<aff_1> {
    private final afl_1 a;

    public ene_1(ekl_0 ekl_02, ekl_0 ekl_03) {
        this.a = new afl_1(ekl_02.P_(), ekl_03.P_());
    }

    public ene_1(aff_1 aff_12, aff_1 aff_13) {
        this.a = new afl_1(aff_12, aff_13);
    }

    public aff_1 a() {
        return this.a.c();
    }

    public aff_1 b() {
        return this.a.d();
    }

    public boolean c() {
        return this.a.a();
    }

    public boolean d() {
        return this.a.b();
    }

    boolean a(ekl_0 ekl_02, int n) {
        if (!this.a(ekl_02.P_(), n)) {
            return false;
        }
        return this.a.e(ekl_02.P_());
    }

    @Override
    @NotNull
    public Iterator<aff_1> iterator() {
        return this.a.iterator();
    }

    public boolean a(aff_1 aff_12, int n) {
        switch (this.a.b(aff_12)) {
            case d: {
                return this.a.d().f(aff_12) <= n;
            }
            case c: {
                return this.a.c().f(aff_12) <= n;
            }
        }
        return false;
    }

    public static boolean a(aff_1 aff_12, aff_1 aff_13, int n) {
        if (!aff_12.i(aff_13)) {
            return false;
        }
        return aff_12.f(aff_13) <= n;
    }

    public String toString() {
        return "{MicrobotCombination from segment " + this.a + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ene_1 ene_12 = (ene_1)object;
        return this.a.equals(ene_12.a);
    }

    public int hashCode() {
        return this.a != null ? this.a.hashCode() : 0;
    }
}

