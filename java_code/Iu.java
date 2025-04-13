/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.io.Files
 */
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipOutputStream;

public final class Iu {
    private final boolean a;
    private final Set<String> b = Sets.newHashSet();

    public Iu(boolean bl) {
        this.a = bl;
    }

    public void a(String string, File file, FileFilter fileFilter, String string2) {
        File file2 = new File(string);
        Files.createParentDirs((File)file2);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        JarOutputStream jarOutputStream = new JarOutputStream(fileOutputStream);
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            for (File file3 : fileArray) {
                this.a(file3, jarOutputStream, null, fileFilter, string2);
            }
        }
        jarOutputStream.close();
    }

    private void a(File file, JarOutputStream jarOutputStream, String string, FileFilter fileFilter, String string2) {
        Object object = file.getName();
        if (string != null) {
            object = string + "/" + (String)object;
        }
        if (file.isDirectory()) {
            File[] fileArray = file.listFiles();
            if (fileArray != null) {
                for (File file2 : fileArray) {
                    this.a(file2, jarOutputStream, (String)object, fileFilter, string2);
                }
            }
        } else {
            if (this.b.contains(file.getAbsolutePath())) {
                return;
            }
            if (fileFilter != null && !fileFilter.accept(file)) {
                return;
            }
            JarEntry jarEntry = new JarEntry((String)object);
            jarEntry.setTime(0L);
            jarOutputStream.putNextEntry(jarEntry);
            Files.copy((File)file, (OutputStream)jarOutputStream);
            jarOutputStream.closeEntry();
            this.b.add(file.getAbsolutePath());
            if (this.a && file.isFile()) {
                file.delete();
            }
        }
    }

    public void a(File file, File ... fileArray) {
        Files.createParentDirs((File)file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        JarOutputStream jarOutputStream = new JarOutputStream(fileOutputStream);
        for (File file2 : fileArray) {
            if (this.b.contains(file2.getAbsolutePath())) continue;
            JarEntry jarEntry = new JarEntry(file2.getName());
            jarEntry.setTime(0L);
            ((ZipOutputStream)jarOutputStream).putNextEntry(jarEntry);
            Files.copy((File)file2, (OutputStream)jarOutputStream);
            jarOutputStream.closeEntry();
            this.b.add(file2.getAbsolutePath());
            if (!this.a || !file2.isFile()) continue;
            file2.delete();
        }
        jarOutputStream.close();
    }

    public String toString() {
        return "JarHelper{m_deleteMode=" + this.a + ", m_files=" + this.b + "}";
    }
}

