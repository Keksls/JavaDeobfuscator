/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

public class bKD
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "characteristics";
    private final bKC d;
    private final List<bkz_0> e;

    public bKD(bKC bKC2) {
        this.d = bKC2;
        this.e = Arrays.stream(bKC2.b()).map(bkz_0::new).collect(Collectors.toList());
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "name": {
                return this.a();
            }
            case "characteristics": {
                return this.e;
            }
        }
        return null;
    }

    public String a() {
        return bae.h().a("market.characteristics.group." + this.d.a(), new Object[0]);
    }

    @Override
    public String[] d() {
        return new String[]{a, b};
    }

    public bKC b() {
        return this.d;
    }

    public List<bkz_0> c() {
        return this.e;
    }
}

