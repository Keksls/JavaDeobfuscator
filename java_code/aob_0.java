/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOb
 */
public final class aob_0
extends aNX {
    private static final aob_0 a = new aob_0();

    private aob_0() {
    }

    public static aob_0 c() {
        return a;
    }

    @Override
    protected aaq_0 a(any_0 any_02) {
        switch (any_02) {
            case r: {
                return new aOn(any_02.a());
            }
            case u: {
                return new aOh(any_02.a());
            }
            case v: {
                return new aOr(any_02.a());
            }
            case w: {
                return new aOl(any_02.a());
            }
            case x: {
                return new aOp(any_02.a());
            }
            case t: {
                return new aOe(any_02.a());
            }
            case B: {
                return new aOj(any_02.a());
            }
        }
        return null;
    }
}

