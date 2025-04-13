/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class UZ<TCountedType extends RI>
implements Vc<TCountedType> {
    protected static final Logger a = Logger.getLogger(UZ.class);
    protected final ArrayList<Vc<TCountedType>> b;
    protected final int c;
    protected int d;

    public UZ(int n) {
        this(n, 0);
    }

    public UZ(int n, int n2) {
        this.c = n;
        this.d = n2;
        this.b = new ArrayList();
    }

    @Override
    public void a(TCountedType TCountedType) {
        ++this.d;
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).a(TCountedType);
        }
    }

    @Override
    public void b(TCountedType TCountedType) {
        --this.d;
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).b(TCountedType);
        }
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    @Override
    public void a(Vc<TCountedType> vc) {
        this.b.add(vc);
    }

    @Override
    public void b(Vc<TCountedType> vc) {
        this.b.remove(vc);
    }

    public void c() {
        this.d = 0;
    }
}

