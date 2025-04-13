/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.jetbrains.annotations.Nullable;

public class fzf {
    public static final String a = "MRU";
    private final HashSet<String> b = new HashSet();
    private final LinkedList<String> c = new LinkedList();
    private final ArrayList<fzi> d = new ArrayList();

    public void a(String string) {
        this.b.add(string);
    }

    public void b(String string) {
        this.b.remove(string);
    }

    public void c(String string) {
        this.b(string);
        this.c.remove(string);
    }

    public void a(fzi fzi2) {
        if (fzi2 != null) {
            this.d.add(fzi2);
        }
    }

    public void b(fzi fzi2) {
        if (fzi2 != null) {
            this.d.remove(fzi2);
        }
    }

    public void a(String string, boolean bl) {
        if (string != null && !this.c.contains(string)) {
            this.c.addFirst(string);
        }
        this.b();
    }

    private void b() {
        ArrayList<String> arrayList = new ArrayList<String>(this.c.size());
        Iterator<fvE> iterator = fta_0.getInstance().getLayeredContainer().getAllWidgetIterator();
        while (iterator.hasNext()) {
            String string;
            fvE fvE2 = iterator.next();
            if (fvE2.getElementMap() == null || !this.c.contains(string = fvE2.getElementMap().c()) || arrayList.contains(string)) continue;
            arrayList.add(string);
        }
        this.c.clear();
        this.c.addAll(arrayList);
    }

    public int c() {
        return this.c.size();
    }

    public fzh a() {
        int n;
        for (int k = n = this.c.size() - 1; k >= 0; --k) {
            String string = this.c.remove(k);
            if (string == null || !fpm_0.b().q(string)) continue;
            boolean bl = false;
            block5: for (int i2 = this.d.size() - 1; i2 >= 0; --i2) {
                fzh fzh2 = this.d.get(i2).onDialogCloseRequest(string);
                switch (fzh2) {
                    case a: {
                        continue block5;
                    }
                    case b: {
                        bl = true;
                        this.c.addLast(string);
                        continue block5;
                    }
                    default: {
                        this.c.addFirst(string);
                        return fzh2;
                    }
                }
            }
            if (bl || this.d(string)) continue;
            fpm_0.b().o(string);
            return fzh.a;
        }
        return fzh.c;
    }

    public boolean d(String string) {
        return string.startsWith(a) || this.b.contains(string);
    }

    @Nullable
    public String d() {
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.getLast();
    }
}

