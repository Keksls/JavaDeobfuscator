/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.inject.Module
 *  com.google.inject.util.Modules
 */
import com.google.common.base.Preconditions;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import java.util.List;
import java.util.Set;

class Gp {
    Gp() {
    }

    public Module a(GC gC) {
        List<Set<Module>> list = new GI(gC).a();
        Preconditions.checkArgument((!list.isEmpty() ? 1 : 0) != 0);
        Module module = Modules.combine((Iterable)list.get(0));
        for (int k = 1; k < list.size(); ++k) {
            module = Modules.override((Module[])new Module[]{module}).with((Iterable)list.get(k));
        }
        return module;
    }
}

