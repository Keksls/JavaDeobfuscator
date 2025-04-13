/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.File;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bSy
 */
public class bsy_0
implements aiu_1 {
    private final aiu_1 a;

    public bsy_0(aiu_1 aiu_12) {
        this.a = aiu_12;
    }

    @Override
    public void a(@NotNull ait_1 ait_12) {
        aiz_1 aiz_12;
        aib_2 aib_22;
        String string;
        if (ait_12.c() == aiv_1.c && (string = (aib_22 = (aib_2)(aiz_12 = (aiz_1)ait_12).a()).c()) != null && !string.equals(aib_22.b())) {
            File file = aiz_12.g();
            aia_2.a.a(file.getName(), string);
        }
        this.a.a(ait_12);
    }

    public String toString() {
        return "CacheFillerListener{}";
    }
}

