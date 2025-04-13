/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class dgU
extends dfc {
    private final boolean a;
    private final List<bKH> b;

    public dgU(bKH bKH2) {
        this(true, List.of(bKH2));
    }

    public dgU(boolean bl, List<bKH> list) {
        this.a = bl;
        this.b = list;
    }

    @Override
    public int a() {
        return 19771;
    }

    public boolean k() {
        return this.a;
    }

    public List<bKH> o() {
        return this.b;
    }
}

