/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.BitSet;

/*
 * Renamed from SJ
 */
public abstract class sj_0 {
    protected final se_0 a;
    protected final TLongArrayList b = new TLongArrayList();
    protected final TLongArrayList c = new TLongArrayList();
    protected final TLongObjectHashMap<sd_0> d = new TLongObjectHashMap();
    private boolean e = true;

    protected sj_0(se_0 se_02) {
        this.a = se_02;
    }

    public boolean a(BitSet bitSet, sd_0 sd_02, byte by) {
        if (!this.e) {
            return false;
        }
        this.a();
        boolean bl = false;
        try {
            bl = this.b(bitSet, sd_02, by);
        }
        catch (Throwable throwable) {
            se_0.a.fatal((Object)("[RUNNING_EFFECT] An error was caught in effect trigger check for effect " + sd_02), throwable);
        }
        if (bl) {
            try {
                this.a(sd_02, by);
            }
            catch (Throwable throwable) {
                se_0.a.error((Object)("[RUNNING_EFFECT] An error was caught in the effect execution for effect " + sd_02), throwable);
            }
        }
        this.a();
        return bl;
    }

    private void a() {
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }

    protected abstract boolean b(BitSet var1, sd_0 var2, byte var3);

    protected abstract void a(sd_0 var1, byte var2);

    protected boolean a(BitSet bitSet, byte by, sd_0 sd_02) {
        boolean bl = false;
        switch (by) {
            case 1: {
                if (sd_02.F() == null || !sd_02.F().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 2: {
                if (sd_02.G() == null || !sd_02.G().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 3: {
                if (sd_02.H() == null || !sd_02.H().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 5: {
                if (sd_02.I() == null || !sd_02.I().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 6: {
                if (sd_02.J() == null || !sd_02.J().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 4: {
                if (sd_02.K() == null || !sd_02.K().intersects(bitSet)) break;
                this.b(sd_02);
                bl = true;
            }
        }
        return bl;
    }

    protected boolean b(BitSet bitSet, byte by, sd_0 sd_02) {
        boolean bl = false;
        switch (by) {
            case 10: {
                if (sd_02.F() == null || !sd_02.F().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 20: {
                if (sd_02.G() == null || !sd_02.G().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 30: {
                if (sd_02.H() == null || !sd_02.H().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 60: {
                if (sd_02.J() == null || !sd_02.J().intersects(bitSet)) break;
                this.a(sd_02);
                bl = true;
                break;
            }
            case 40: {
                if (sd_02.K() == null || !sd_02.K().intersects(bitSet)) break;
                this.b(sd_02);
                bl = true;
            }
        }
        return bl;
    }

    protected void a(sd_0 sd_02) {
        this.b.add(sd_02.c());
        this.d.put(sd_02.c(), (Object)sd_02);
    }

    protected void b(sd_0 sd_02) {
        this.c.add(sd_02.c());
        this.d.put(sd_02.c(), (Object)sd_02);
    }

    public void a(boolean bl) {
        this.e = bl;
    }
}

