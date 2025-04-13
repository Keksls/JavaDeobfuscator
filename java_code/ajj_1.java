/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aJJ
 */
public interface ajj_1 {
    public void a(String var1, Object var2);

    default public void a(ajf_1 ajf_12, @NotNull Collection<String> collection) {
        this.a(ajf_12, collection.toArray(new String[0]));
    }

    public void a(ajf_1 var1, String ... var2);
}

