/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atf
 */
public class atf_1
extends asp_1 {
    private final TIntObjectHashMap<URL> b = new TIntObjectHashMap();
    private ast_1 c = null;
    private boolean d = true;

    public atf_1(@NotNull afk_2 afk_22) {
        super(ass_1.a, afk_22);
    }

    public boolean f() {
        return this.d;
    }

    public ast_1 g() {
        return this.c;
    }

    public URL a(int n) {
        return (URL)this.b.get(n);
    }

    public int h() {
        return this.b.size();
    }

    public int[] i() {
        return this.b.keys();
    }

    void a(@NotNull URL uRL, int n) {
        this.b.put(n, (Object)uRL);
    }

    void a(ast_1 ast_12) {
        this.c = ast_12;
    }

    void a(boolean bl) {
        this.d = bl;
    }
}

