/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from eYs
 */
public class eys_2
implements abo_1 {
    protected static final Logger a = Logger.getLogger(eys_2.class);
    private static final ObjectPool c = new abm_1(new eyt_1());
    private boolean d;
    private short e;
    private short f;
    private short g;
    private short h;
    private int i;
    public apc_2 b;

    eys_2() {
    }

    public eys_2(short s2, short s3, int n, short s4, short s5, apc_2 apc_22) {
        this.e = s2;
        this.f = s3;
        this.i = n;
        this.g = s4;
        this.h = s5;
        this.b = apc_22;
    }

    public static eys_2 a(short s2, short s3, int n, short s4, short s5, apc_2 apc_22) {
        eys_2 eys_22;
        try {
            eys_22 = (eys_2)c.borrowObject();
            eys_22.d = true;
        }
        catch (Exception exception) {
            eys_22 = new eys_2();
            eys_22.d = false;
            a.error((Object)"Impossible de sortir un WakfuLootDescriptor du pool");
        }
        eys_22.e = s2;
        eys_22.f = s3;
        eys_22.i = n;
        eys_22.g = s4;
        eys_22.h = s5;
        eys_22.b = apc_22;
        return eys_22;
    }

    @Override
    public void onCheckOut() {
        this.e = 0;
        this.f = 0;
        this.i = 0;
        this.g = 0;
        this.h = 0;
        this.b = null;
    }

    @Override
    public void onCheckIn() {
    }

    public void a() {
        if (this.d) {
            try {
                c.returnObject((Object)this);
                this.d = false;
            }
            catch (Exception exception) {
                a.error((Object)"Impossible de rentrer un WakfuLootDescriptor dans le pool");
            }
        } else {
            this.onCheckIn();
        }
    }

    public short b() {
        return this.e;
    }

    public short c() {
        return this.f;
    }

    public short d() {
        return this.g;
    }

    public short e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }
}

