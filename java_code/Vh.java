/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class Vh<R extends Vk>
implements Iterable<R> {
    private final Collection<R> a = new ArrayList<R>();

    public void a(R r2) {
        this.a.add(r2);
    }

    @Override
    @NotNull
    public Iterator<R> iterator() {
        return this.a.iterator();
    }

    public String toString() {
        return "LadderInitializeData{m_list=" + this.a + "}";
    }
}

