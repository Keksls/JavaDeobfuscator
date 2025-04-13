/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public class fwt<T extends fwA>
implements fwA {
    private final long a;
    private final azj_2 b;
    private final String c;
    private final String d;
    private int e;
    private final ArrayList<fwB> f = new ArrayList();
    private short g;
    private T h;

    public fwt(long l, azj_2 azj_22, String string, String string2) {
        this.a = l;
        this.b = azj_22;
        this.c = string;
        this.d = string2;
    }

    public T q() {
        return this.h;
    }

    public void a(T t) {
        this.h = t;
    }

    @Override
    public short aY_() {
        return this.g;
    }

    public void a(short s2) {
        this.g = s2;
    }

    public void a(fwB fwB2) {
        this.f.add(fwB2);
    }

    public void b(fwB fwB2) {
        this.f.remove(fwB2);
    }

    public void r() {
        this.f.clear();
    }

    @Override
    public List<fwB> i() {
        return this.f;
    }

    @Override
    public azj_2 aX_() {
        return this.b;
    }

    @Override
    public long j() {
        return this.a;
    }

    @Override
    public byte aZ_() {
        return 0;
    }

    @Override
    public String bc_() {
        return this.c;
    }

    public void a(int n) {
        this.e = n;
    }

    @Override
    public int m() {
        return this.e;
    }

    @Override
    public String bd_() {
        return this.d;
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    @Nullable
    public String n() {
        return null;
    }

    @Override
    @Nullable
    public String o() {
        return null;
    }

    @Override
    @Nullable
    public String b() {
        return null;
    }

    @Override
    public long p() {
        return -1L;
    }

    @Override
    public Collection<? extends fwA> bb_() {
        return Collections.singleton(this);
    }

    @Override
    public String d() {
        return null;
    }
}

