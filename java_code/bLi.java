/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bLi
implements ajh_1 {
    public static final String a = "selectedColor";
    public static final String b = "enabled";
    @NotNull
    private bLh d;
    private boolean e = true;

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "selectedColor": {
                return this.d;
            }
            case "enabled": {
                return this.e;
            }
        }
        return null;
    }

    public faL a() {
        return this.d.a();
    }

    @Override
    public String[] d() {
        return new String[]{a, b};
    }

    @NotNull
    public bLh b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }

    public void a(@NotNull bLh bLh2) {
        if (bLh2 == null) {
            throw new NullPointerException("m_selectedSlotColor is marked non-null but is null");
        }
        this.d = bLh2;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public bLi(@NotNull bLh bLh2) {
        if (bLh2 == null) {
            throw new NullPointerException("selectedSlotColor is marked non-null but is null");
        }
        this.d = bLh2;
    }
}

