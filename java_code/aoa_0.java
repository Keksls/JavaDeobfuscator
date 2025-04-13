/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOa
 */
class aoa_0
implements ZX<any_0> {
    aoa_0() {
    }

    public any_0 b(String string) {
        return any_0.valueOf(string);
    }

    public any_0 c(int n) {
        for (any_0 any_02 : any_0.values()) {
            if (any_02.a() != n) continue;
            return any_02;
        }
        return null;
    }

    @Override
    public String b(int n) {
        any_0 any_02 = this.c(n);
        return any_02 == null ? "<unknow " + n + ">" : any_02.name();
    }

    @Override
    public aaq_0 a(any_0 any_02) {
        int n = any_02.a();
        switch (any_02) {
            case a: {
                return new abp(n, aai.a);
            }
            case b: {
                return new abp(n, aai.c);
            }
            case c: {
                return new abq(n, aam.f);
            }
            case d: {
                return new abq(n, aam.g);
            }
            case e: {
                return new abq(n, aam.h);
            }
            case f: {
                return new abq(n, aam.i);
            }
            case g: {
                return new abq(n, aam.j);
            }
            case h: {
                return new abq(n, aam.k);
            }
            case i: {
                return new abo(n);
            }
            case k: {
                return new abq(n, aam.d);
            }
            case m: {
                return new abq(n, aam.c);
            }
            case l: {
                return new abq(n, aam.b);
            }
            case n: {
                return new abq(n, aam.a);
            }
            case o: {
                return new abq(n, aam.e);
            }
            case p: {
                return new abp(n, aai.b);
            }
            case q: {
                return new aac_0(n);
            }
            case r: {
                return null;
            }
            case s: {
                return new aan_0(n);
            }
            case t: {
                return null;
            }
            case u: {
                return null;
            }
            case v: {
                return null;
            }
            case w: {
                return null;
            }
            case x: {
                return null;
            }
            case y: {
                return new aaj_0(n);
            }
            case z: {
                return new aal_0(n);
            }
            case A: {
                return new aah_0(n);
            }
            case B: {
                return null;
            }
            case C: {
                return new abe(n);
            }
            case D: {
                return new abi(n);
            }
            case E: {
                return new abk(n);
            }
            case F: {
                return new abc(n);
            }
            case G: {
                return new abg(n);
            }
            case H: {
                return new aba(n);
            }
        }
        return null;
    }

    @Override
    public /* synthetic */ ZW a(String string) {
        return this.b(string);
    }

    @Override
    public /* synthetic */ ZW a(int n) {
        return this.c(n);
    }
}

