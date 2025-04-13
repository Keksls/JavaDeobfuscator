/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.openal.OpenALException
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.openal.OpenALException;

/*
 * Renamed from aMc
 */
public class amc_1
extends all_1 {
    private static final boolean l = false;
    private static final Logger m = Logger.getLogger(amc_1.class);
    public static final byte i = 4;
    private amj_1 n;
    private amj_1 o;
    private amj_1 p;
    private boolean q = false;
    private amj_1 r;
    private ame_1 s = ame_1.a;
    private ame_1 t = ame_1.a;
    private ArrayList<amb_1> u = null;
    private boolean v;
    private int w = 0;
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private int A = 0;
    private long B = 0L;
    private amb_1 C = null;
    private float D = 0.0f;
    private boolean E = false;
    private boolean F = false;
    public boolean j = false;
    private int G = 4000;
    private int H = 4000;
    private final Object I = new Object();

    public amc_1(String string) {
        this(string, -1);
    }

    public amc_1(String string, byte by) {
        this(string, 0, by);
    }

    public amc_1(String string, byte by, byte by2) {
        super(string, by, by2);
        this.c(true);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public boolean x() {
        return this.j;
    }

    public void e(boolean bl) {
        this.j = bl;
        this.y = 0;
        if (this.x()) {
            this.s = ame_1.b;
        }
    }

    public final amj_1 y() {
        return this.n;
    }

    public final void d(int n) {
        this.G = n;
    }

    public final void e(int n) {
        this.H = n;
    }

    public final synchronized amj_1 a(amx_1 amx_12, float f2) {
        return this.a(amx_12, f2, false);
    }

    public synchronized void f(boolean bl) {
        if (this.C != null && this.E != bl) {
            this.F = true;
        }
        this.E = bl;
    }

    @Override
    public void s() {
    }

    public final synchronized amj_1 a(long l, float f2) {
        return this.a(l, f2, false);
    }

    public final synchronized void g(boolean bl) {
        if (bl == this.q) {
            return;
        }
        this.q = bl;
        if (this.q) {
            this.r = this.n;
            if (this.r != null) {
                this.r.a(0.0f, this.H);
                this.r.g(true);
            }
            this.t = this.s;
            this.s = ame_1.g;
            this.n = null;
        } else {
            if (this.r != null) {
                this.r.r();
                if (this.t == ame_1.a) {
                    this.r.a(0.0f, this.H);
                    this.r.f(true);
                } else {
                    this.c(this.r);
                }
            } else if (this.n != null) {
                this.n.a(0.0f, this.H);
                this.n.f(true);
            }
            this.s = this.t;
            this.r = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void a(long l) {
        super.a(l);
        Object object = this.I;
        synchronized (object) {
            afr_2 afr_22 = afr_2.g;
            try {
                if (this.n != null) {
                    this.n.a(afr_22);
                    try {
                        switch (this.n.b(l)) {
                            case 1: 
                            case 3: {
                                ams_1.a(this.n);
                                this.n = null;
                                if (this.s != ame_1.c && this.s != ame_1.d) break;
                                this.s = ame_1.e;
                            }
                        }
                    }
                    catch (OpenALException openALException) {
                        m.error((Object)"OpenALException during MusicGroup update", (Throwable)openALException);
                        ams_1.a(this.n);
                        this.n = null;
                    }
                }
                if (this.o != null) {
                    this.o.a(afr_22);
                    try {
                        switch (this.o.b(l)) {
                            case 1: 
                            case 3: {
                                ams_1.a(this.o);
                                this.o = null;
                            }
                        }
                    }
                    catch (OpenALException openALException) {
                        m.error((Object)"OpenALException during MusicGroup update", (Throwable)openALException);
                        ams_1.a(this.o);
                        this.o = null;
                    }
                }
                if (this.r != null) {
                    this.r.a(afr_22);
                    try {
                        switch (this.r.b(l)) {
                            case 1: 
                            case 3: {
                                ams_1.a(this.r);
                                this.r = null;
                            }
                        }
                    }
                    catch (OpenALException openALException) {
                        m.error((Object)"OpenALException during MusicGroup update", (Throwable)openALException);
                        ams_1.a(this.r);
                        this.r = null;
                    }
                }
            }
            catch (Exception exception) {
                m.error((Object)"Exception during MusicGroup update", (Throwable)exception);
            }
            if (this.o != null && this.n == null) {
                this.n = this.o;
                this.o = null;
            }
            if (this.o == null && this.p != null) {
                amj_1 amj_12 = this.p;
                this.p = null;
                this.c(amj_12);
            }
            switch (this.s) {
                case a: {
                    break;
                }
                case b: {
                    long l2;
                    this.w = 0;
                    if (this.u == null) break;
                    this.C = this.u.get(this.w);
                    long l3 = l2 = this.E ? this.C.b() : this.C.a();
                    if (this.r != null && this.r.L() != l2) {
                        ams_1.a(this.r);
                        this.r = null;
                        this.q = false;
                        this.t = ame_1.c;
                    }
                    amj_1 amj_13 = this.a(l2, (float)this.C.c() / 100.0f, true);
                    this.x = this.C.f() == -1 || amj_13 == null ? -1 : this.C.f() * amj_13.x();
                    this.y = 0;
                    this.s = ame_1.c;
                    break;
                }
                case c: {
                    if (!this.j) {
                        this.y = (int)((long)this.y + (l - this.B));
                    }
                    if (this.x != -1 && this.y + this.H > this.x) {
                        if (this.n != null) {
                            this.n.a(0.0f, this.H);
                            this.n.f(true);
                        }
                        this.s = ame_1.d;
                        break;
                    }
                    if (!this.F) break;
                    long l4 = 0L;
                    if (!this.n.F()) break;
                    if (this.n != null) {
                        l4 = this.n.D();
                    }
                    long l5 = this.E ? this.C.b() : this.C.a();
                    int n = this.H;
                    int n2 = this.G;
                    this.G = 200;
                    this.H = 250;
                    amj_1 amj_14 = this.a(l5, (float)this.C.c() / 100.0f, true);
                    this.G = n2;
                    this.H = n;
                    if (amj_14 != null) {
                        amj_14.d(l4);
                    }
                    this.F = false;
                    break;
                }
                case d: {
                    break;
                }
                case e: {
                    if (this.u == null) break;
                    short s2 = this.u.get(this.w).d();
                    this.C = null;
                    this.s = ame_1.f;
                    this.z = s2 * 1000;
                    this.A = 0;
                    break;
                }
                case f: {
                    if (this.u == null) break;
                    this.A = (int)((long)this.A + (l - this.B));
                    if (this.A <= this.z) break;
                    this.A = 0;
                    this.z = 0;
                    ++this.w;
                    if (this.w == this.u.size()) {
                        if (this.v) {
                            this.w = 0;
                        } else {
                            this.u = null;
                            this.s = ame_1.a;
                            break;
                        }
                    }
                    this.C = this.u.get(this.w);
                    long l6 = this.E ? this.C.b() : this.C.a();
                    amj_1 amj_15 = this.a(l6, (float)this.C.c() / 100.0f, true);
                    this.x = this.C.f() == -1 || amj_15 == null ? -1 : this.C.f() * amj_15.x();
                    this.y = 0;
                    this.s = ame_1.c;
                    break;
                }
                case g: {
                    break;
                }
            }
            this.B = l;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final synchronized void t() {
        Object object = this.I;
        synchronized (object) {
            if (this.n != null) {
                ams_1.a(this.n);
                this.n = null;
            }
            if (this.o != null) {
                ams_1.a(this.o);
                this.o = null;
            }
            if (this.p != null) {
                ams_1.a(this.p);
                this.p = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final synchronized void b(amj_1 amj_12) {
        Object object = this.I;
        synchronized (object) {
            if (this.n == amj_12) {
                ams_1.a(this.n);
                this.n = null;
            }
            if (this.o == amj_12) {
                ams_1.a(this.o);
                this.o = null;
            }
            if (this.p == amj_12) {
                ams_1.a(this.p);
                this.p = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void u() {
        Object object = this.I;
        synchronized (object) {
            if (this.n != null) {
                this.n.s();
            }
            if (this.o != null) {
                this.o.s();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void v() {
        Object object = this.I;
        synchronized (object) {
            if (this.n != null) {
                try {
                    this.n.k();
                }
                catch (Exception exception) {
                    m.warn((Object)"Impossible de red\u00e9marrer la musique");
                }
            }
            if (this.o != null) {
                try {
                    this.o.k();
                }
                catch (Exception exception) {
                    m.warn((Object)"Impossible de red\u00e9marrer la musique");
                }
            }
        }
    }

    @Override
    public boolean c(int n) {
        assert (false) : "On peut pas appliquer de reverb sur de la musique";
        return true;
    }

    @Override
    public Collection<amj_1> r() {
        assert (false) : "Ne doit pas etre appel\u00e9";
        return null;
    }

    @Override
    public amj_1 a(amx_1 amx_12, boolean bl, boolean bl2, boolean bl3, long l) {
        assert (false) : "Ne doit pas \u00eatre appel\u00e9";
        return null;
    }

    @Override
    public void a(amj_1 amj_12) {
        assert (false) : "Ne doit pas \u00eatre appel\u00e9";
    }

    @Override
    public final synchronized void f(float f2) {
        float f3 = this.a();
        if (this.n != null) {
            this.n.h(f3);
        }
        if (this.o != null) {
            this.o.h(f3);
        }
        if (this.p != null) {
            this.p.h(f3);
        }
    }

    @Override
    public final void b(float f2, float f3) {
    }

    @Override
    public final void c(float f2, float f3) {
    }

    @Override
    public final synchronized void a(boolean bl, boolean bl2) {
        if (this.n != null) {
            this.n.d(bl2);
        }
        if (this.o != null) {
            this.o.d(bl2);
        }
        if (this.p != null) {
            this.p.d(bl2);
        }
    }

    public final ame_1 z() {
        return this.s;
    }

    public final synchronized void a(@Nullable ArrayList<amb_1> arrayList) {
        this.a(arrayList, false);
    }

    public final synchronized void a(@Nullable ArrayList<amb_1> arrayList, boolean bl) {
        if (this.u == arrayList) {
            return;
        }
        this.v = bl;
        ame_1 ame_12 = arrayList == null ? ame_1.a : ame_1.b;
        if (this.s == ame_1.g) {
            this.t = ame_12;
        } else {
            this.s = ame_12;
        }
        if (this.s == ame_1.a && this.n != null) {
            this.n.a(0.0f, this.H);
            this.n.f(true);
        }
        this.u = arrayList;
    }

    public final synchronized void g(float f2) {
        if (this.n != null) {
            this.n.a(0.0f, f2);
            this.n.f(true);
        }
        if (this.o != null) {
            this.o.a(0.0f, f2);
            this.o.f(true);
        }
        if (this.r != null) {
            this.r.a(0.0f, f2);
            this.r.f(true);
        }
        if (this.p != null) {
            ams_1.a(this.p);
            this.p = null;
        }
    }

    public final synchronized void A() {
        this.g(this.H);
    }

    private amj_1 a(long l, float f2, boolean bl) {
        if (this.d != null) {
            amx_1 amx_12;
            try {
                amx_12 = this.d.a(l);
            }
            catch (IOException iOException) {
                m.error((Object)("Impossible de charger le son d'id " + l));
                return null;
            }
            if (amx_12 != null) {
                return this.a(amx_12, f2, bl);
            }
        } else {
            m.error((Object)"AudioResourceHelper non sp\u00e9cifi\u00e9.");
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private amj_1 a(amx_1 amx_12, float f2, boolean bl) {
        Object object = this.I;
        synchronized (object) {
            amj_1 amj_12;
            if (this.n != null && this.n.p() && this.n.a() > 0.0f) {
                if (this.n.e().b().equals(amx_12.g())) {
                    return this.n;
                }
            } else if (this.o != null && this.o.p() && this.o.a() > 0.0f && this.o.e().b().equals(amx_12.g())) {
                return this.o;
            }
            if ((amj_12 = this.a(amx_12, -1L)) != null) {
                amj_12.b(true);
                amj_12.e(f2);
                amj_12.h(this.a());
                this.c(amj_12);
                if (!bl) {
                    this.B();
                }
            }
            return amj_12;
        }
    }

    private void c(amj_1 amj_12) {
        if (amj_12 == null) {
            return;
        }
        if (this.o == null) {
            if (this.n != null) {
                this.n.a(0.0f, this.H);
                this.n.f(true);
            }
        } else {
            if (this.p != null) {
                ams_1.a(this.p);
            }
            this.p = amj_12;
            return;
        }
        this.o = this.n;
        this.n = amj_12;
        amj_12.d(this.n());
        try {
            amj_12.c(0.0f);
            amj_12.k();
            amj_12.a(amj_12.z(), this.G);
        }
        catch (Exception exception) {
            m.error((Object)"Exception lev\u00e9e durant le crossfading :", (Throwable)exception);
            ams_1.a(amj_12);
            this.n = null;
            this.p = null;
            this.o = null;
        }
    }

    private void B() {
        this.s = ame_1.a;
        this.u = null;
    }
}

