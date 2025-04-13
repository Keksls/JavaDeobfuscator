/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from fcI
 */
public abstract class fci_0
extends fcg_0<fck> {
    protected static final Logger a = Logger.getLogger(fci_0.class);
    private final List<fck> b = new ArrayList<fck>();
    short c;
    final fdk_0 d = this.b();
    private final fcj_0 e = new fcj_0(this);
    private final fck_0 f = new fck_0(this);
    short g;
    int h;
    int i;

    protected fci_0(faX faX2) {
        super(faX2);
    }

    @Override
    public void bf_() {
        this.d.a(this.g(), this.b);
    }

    protected fdk_0 b() {
        return new fdk_0();
    }

    @Override
    public void a(fck fck2) {
        this.b.add(fck2);
    }

    @Override
    public void b(fck fck2) {
        this.b.remove(fck2);
    }

    @Override
    public void a(long l) {
        throw new UnsupportedOperationException("Impossible \u00e0 partir de ce Client/server");
    }

    @Override
    public void b(long l) {
        throw new UnsupportedOperationException("Impossible \u00e0 partir de ce Client/server");
    }

    public fdk_0 c() {
        return this.d;
    }

    public void a(short s2, short s3, int n, int n2) {
        this.c = s2;
        this.g = s3;
        this.h = n;
        this.i = n2;
    }

    public short d() {
        return this.c;
    }

    public short e() {
        return this.g;
    }

    public int f() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public fcj_0 i() {
        return this.e;
    }

    public fck_0 j() {
        return this.f;
    }

    @Override
    public /* synthetic */ void a(fcj fcj2) {
        this.b((fck)fcj2);
    }

    @Override
    public /* synthetic */ void b(fcj fcj2) {
        this.a((fck)fcj2);
    }
}

