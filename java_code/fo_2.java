/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from fO
 */
public final class fo_2
extends GeneratedMessageV3
implements fr_2 {
    private static final long c = 0L;
    public static final int a = 1;
    List<Integer> d;
    private byte e = (byte)-1;
    private static final fo_2 f = new fo_2();
    @Deprecated
    public static final Parser<fo_2> b = new fp_2();

    fo_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fo_2() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fo_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        if (!(bl & true)) {
                            this.d = new ArrayList<Integer>();
                            bl |= true;
                        }
                        this.d.add(codedInputStream.readInt32());
                        continue block11;
                    }
                    case 10: 
                }
                int n2 = codedInputStream.readRawVarint32();
                int n3 = codedInputStream.pushLimit(n2);
                if (!(bl & true) && codedInputStream.getBytesUntilLimit() > 0) {
                    this.d = new ArrayList<Integer>();
                    bl |= true;
                }
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    this.d.add(codedInputStream.readInt32());
                }
                codedInputStream.popLimit(n3);
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.d = Collections.unmodifiableList(this.d);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return fr_1.o;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.p.ensureFieldAccessorsInitialized(fo_2.class, fq_2.class);
    }

    @Override
    public List<Integer> b() {
        return this.d;
    }

    @Override
    public int c() {
        return this.d.size();
    }

    @Override
    public int a(int n) {
        return this.d.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.d.size(); ++k) {
            codedOutputStream.writeInt32(1, this.d.get(k).intValue());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        int n2 = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)this.d.get(k));
        }
        n += n2;
        n += 1 * this.b().size();
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fo_2)) {
            return super.equals(object);
        }
        fo_2 fo_22 = (fo_2)object;
        boolean bl = true;
        bl = bl && this.b().equals(fo_22.b());
        bl = bl && this.unknownFields.equals((Object)fo_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fo_2.a().hashCode();
        if (this.c() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fo_2 a(ByteBuffer byteBuffer) {
        return (fo_2)b.parseFrom(byteBuffer);
    }

    public static fo_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fo_2 a(ByteString byteString) {
        return (fo_2)b.parseFrom(byteString);
    }

    public static fo_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static fo_2 a(byte[] byArray) {
        return (fo_2)b.parseFrom(byArray);
    }

    public static fo_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static fo_2 a(InputStream inputStream) {
        return (fo_2)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static fo_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fo_2 b(InputStream inputStream) {
        return (fo_2)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static fo_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fo_2 a(CodedInputStream codedInputStream) {
        return (fo_2)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static fo_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fq_2 d() {
        return fo_2.e();
    }

    public static fq_2 e() {
        return f.f();
    }

    public static fq_2 a(fo_2 fo_22) {
        return f.f().a(fo_22);
    }

    public fq_2 f() {
        return this == f ? new fq_2() : new fq_2().a(this);
    }

    protected fq_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        fq_2 fq_22 = new fq_2(builderParent);
        return fq_22;
    }

    public static fo_2 g() {
        return f;
    }

    public static Parser<fo_2> h() {
        return b;
    }

    public Parser<fo_2> getParserForType() {
        return b;
    }

    public fo_2 i() {
        return f;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    static /* synthetic */ boolean j() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fo_2 fo_22) {
        return fo_22.unknownFields;
    }
}

