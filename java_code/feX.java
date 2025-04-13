/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public abstract class feX
implements Iterable<feY> {
    private feW b;
    protected final HashMap<Byte, feY> a = new HashMap();

    protected feX() {
    }

    public void a(feW feW2) {
        this.b = feW2;
    }

    public feW a() {
        return this.b;
    }

    public void a(byte by, feY feY2) {
        if (feY2 != null && this.b(by)) {
            short[] sArray = this.c(by);
            feY2.a(sArray[0]);
            feY2.b(sArray[1]);
            feY2.a(by);
            feY2.a(this);
            this.a.put(by, feY2);
        }
    }

    public feY a(byte by) {
        if (this.b(by)) {
            return this.a.get(by);
        }
        return null;
    }

    @Override
    @NotNull
    public Iterator<feY> iterator() {
        return this.a.values().iterator();
    }

    public feY a(int n, int n2) {
        for (Map.Entry<Byte, feY> entry : this.a.entrySet()) {
            feY feY2 = entry.getValue();
            if (!feY2.a(n, n2)) continue;
            return feY2;
        }
        return null;
    }

    public void b() {
        this.a.clear();
    }

    public abstract byte c();

    public abstract boolean b(byte var1);

    public abstract short[] c(byte var1);

    public abstract void a(feZ var1);
}

