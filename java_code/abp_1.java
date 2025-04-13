/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/*
 * Renamed from aBp
 */
public abstract class abp_1 {
    private static final Logger a = Logger.getLogger(abp_1.class);
    public static final String W = "Using an item with a reference counter < 0 is forbidden";
    private static final short b = 10;
    private static final int c = 0x7FFFFFFE;
    private int d = 0;

    public final boolean av() {
        return this.d >= 0;
    }

    public void k_() {
        assert (this.av()) : "Using an item with a reference counter < 0 is forbidden";
        assert (this.d < Integer.MAX_VALUE) : "Too many references added";
        if (this.d >= 0x7FFFFFFE) {
            if (this.d == 0x7FFFFFFE) {
                a.fatal((Object)("Too many references added " + this.getClass().getName()), (Throwable)new Exception());
                JOptionPane.showMessageDialog(null, "Fatal error: Too many references added " + this.getClass().getName());
                ++this.d;
            }
        } else {
            ++this.d;
        }
    }

    public void u() {
        if (--this.d == -1) {
            this.l_();
        }
        if (this.d == -2) {
            a.warn((Object)("on enl\u00e8ve encore une reference " + this.getClass().getSimpleName()));
        }
    }

    public final int aw() {
        return this.d;
    }

    protected void j_() {
    }

    protected void l_() {
        this.j_();
    }

    final void ax() {
        this.d = 0;
    }
}

