/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bue
 */
public abstract class bue_0
implements aqs_2 {
    protected static final Logger a = Logger.getLogger(bue_0.class);
    private final int b;

    protected bue_0(int n) {
        this.b = n;
    }

    public abstract void a();

    protected abstract void a(ArrayList<aot_2> var1);

    public boolean b(ArrayList<aot_2> arrayList) {
        if (UM.a(this, arrayList)) {
            this.a(arrayList);
            return true;
        }
        a.error((Object)("L'action client (" + this.getClass() + ") n'a pas les param\u00e8tres du bon type id=" + this.b));
        return false;
    }

    public int b() {
        return this.b;
    }
}

