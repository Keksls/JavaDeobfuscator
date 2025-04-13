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
 * Renamed from eFn
 */
public class efn_0
extends Sr {
    public static final int a = -1;
    protected static final Logger b = Logger.getLogger(efn_0.class);
    private boolean c = false;
    private boolean d = false;
    private boolean e;
    private ejh_0 f;
    private int g = -1;
    private boolean h = true;
    private int i = 0;
    private boolean j = false;
    private boolean k = false;
    private efo_0 l = efo_0.a;
    private List<eft_0> m;

    public static efn_0 a(boolean bl, boolean bl2, ejh_0 ejh_02) {
        efn_0 efn_02 = new efn_0();
        efn_02.c = bl;
        efn_02.d = bl2;
        efn_02.f = ejh_02;
        return efn_02;
    }

    public boolean d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public ejh_0 f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public void a(int n) {
        this.g = n;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    @Override
    public boolean c() {
        return this.h;
    }

    public boolean h() {
        return this.k;
    }

    public void i() {
        this.k = true;
    }

    public void b(int n) {
        this.l = efo_0.b;
        this.i = n;
    }

    public void a(int n, efo_0 efo_02) {
        if (efo_02 == efo_0.a) {
            b.error((Object)"On ne peut pas forcer une valeur avec le type NONE");
            return;
        }
        this.l = efo_02;
        this.i = n;
    }

    public int j() {
        return this.i;
    }

    public boolean k() {
        return this.l != efo_0.a;
    }

    public boolean l() {
        return this.e;
    }

    public void b(boolean bl) {
        this.e = bl;
    }

    public efo_0 m() {
        return this.l;
    }

    public boolean n() {
        return this.j;
    }

    public void c(boolean bl) {
        this.j = bl;
    }

    public void a(eft_0 eft_02) {
        if (this.m == null) {
            this.m = new ArrayList<eft_0>();
        }
        if (!this.m.contains(eft_02)) {
            this.m.add(eft_02);
        }
    }

    public void b(eft_0 eft_02) {
        if (this.m == null) {
            return;
        }
        this.m.remove(eft_02);
    }

    public List<eft_0> o() {
        return this.m;
    }

    private void q() {
        this.c = false;
        this.d = false;
        this.g = -1;
        this.h = true;
        this.l = efo_0.a;
        this.m = null;
        this.i = 0;
        this.j = false;
        this.f = null;
        this.k = false;
        this.e = false;
    }

    @Override
    public void a() {
        this.q();
    }

    public efn_0 p() {
        efn_0 efn_02 = efn_0.a(this.c, this.d, this.f);
        efn_02.g = this.g;
        efn_02.i = this.i;
        efn_02.l = this.l;
        efn_02.h = this.h;
        efn_02.j = this.j;
        efn_02.k = this.k;
        efn_02.e = this.e;
        if (this.m != null) {
            efn_02.m = new ArrayList<eft_0>(this.m);
        }
        return efn_02;
    }

    @Override
    public /* synthetic */ Sr b() {
        return this.p();
    }
}

