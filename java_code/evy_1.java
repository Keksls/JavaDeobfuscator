/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eVy
 */
public class evy_1 {
    @SerializedName(value="items")
    @NotNull
    private final Map<Integer, Integer> a = new HashMap<Integer, Integer>();
    @SerializedName(value="kamas")
    private final long b;

    public evy_1(@Nullable Map<Integer, Integer> map, long l) {
        if (map != null) {
            this.a.putAll(map);
        }
        this.b = l;
    }

    @NotNull
    public Map<Integer, Integer> a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public String toString() {
        return "StelePrice(m_items=" + this.a() + ", m_kamas=" + this.b() + ")";
    }
}

