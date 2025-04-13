/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from apc
 */
public abstract class apc_2
extends aot_2 {
    public static final int c = 0;
    public static final int d = -1;
    private boolean a = false;
    protected static final Logger e = Logger.getLogger(apc_2.class);

    public apc_2 e() {
        if (!this.a()) {
            this.a = !this.a;
            return this;
        }
        return new aov_2(!this.b(null, null, null, null));
    }

    public abstract boolean a();

    public abstract int a(Object var1, Object var2, Object var3, Object var4);

    public boolean b(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        try {
            boolean bl2 = bl = this.a(object, object2, object3, object4) == 0;
            if (this.a) {
                return !bl;
            }
        }
        catch (aob_1 aob_12) {
            bl = false;
            e.error((Object)("Expected exception on " + this.c().name() + " | User : " + object + " Target : " + object2 + " Context : " + object4), (Throwable)aob_12);
        }
        catch (RuntimeException runtimeException) {
            bl = false;
            e.error((Object)("Unexpected exception on " + this.c().name() + " | User : " + object + " Target : " + object2 + " Context : " + object4), (Throwable)runtimeException);
        }
        return bl;
    }

    @Override
    public aov_1 t_() {
        return aov_1.c;
    }

    public boolean f() {
        return this.a;
    }
}

