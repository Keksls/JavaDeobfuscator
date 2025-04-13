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

/*
 * Renamed from fK
 */
public final class fk_2
extends GeneratedMessageV3
implements fn_2 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    int g;
    public static final int b = 2;
    int h;
    public static final int c = 3;
    int i;
    private byte j = (byte)-1;
    private static final fk_2 k = new fk_2();
    @Deprecated
    public static final Parser<fk_2> d = new fl_2();

    fk_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fk_2() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fk_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.f |= 2;
                        this.h = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 4;
                this.i = codedInputStream.readInt32();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return fr_1.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.n.ensureFieldAccessorsInitialized(fk_2.class, fm_2.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public int c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public int e() {
        return this.h;
    }

    @Override
    public boolean f() {
        return (this.f & 4) == 4;
    }

    @Override
    public int g() {
        return this.i;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt32(1, this.g);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeInt32(2, this.h);
        }
        if ((this.f & 4) == 4) {
            codedOutputStream.writeInt32(3, this.i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.g);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.h);
        }
        if ((this.f & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fk_2)) {
            return super.equals(object);
        }
        fk_2 fk_22 = (fk_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == fk_22.b();
        if (this.b()) {
            bl = bl && this.c() == fk_22.c();
        }
        boolean bl3 = bl = bl && this.d() == fk_22.d();
        if (this.d()) {
            bl = bl && this.e() == fk_22.e();
        }
        boolean bl4 = bl = bl && this.f() == fk_22.f();
        if (this.f()) {
            bl = bl && this.g() == fk_22.g();
        }
        bl = bl && this.unknownFields.equals((Object)fk_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fk_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + this.g();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fk_2 a(ByteBuffer byteBuffer) {
        return (fk_2)d.parseFrom(byteBuffer);
    }

    public static fk_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fk_2)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fk_2 a(ByteString byteString) {
        return (fk_2)d.parseFrom(byteString);
    }

    public static fk_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fk_2)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static fk_2 a(byte[] byArray) {
        return (fk_2)d.parseFrom(byArray);
    }

    public static fk_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fk_2)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static fk_2 a(InputStream inputStream) {
        return (fk_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static fk_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fk_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fk_2 b(InputStream inputStream) {
        return (fk_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static fk_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fk_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fk_2 a(CodedInputStream codedInputStream) {
        return (fk_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static fk_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fk_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fm_2 h() {
        return fk_2.i();
    }

    public static fm_2 i() {
        return k.j();
    }

    public static fm_2 a(fk_2 fk_22) {
        return k.j().a(fk_22);
    }

    public fm_2 j() {
        return this == k ? new fm_2() : new fm_2().a(this);
    }

    protected fm_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        fm_2 fm_22 = new fm_2(builderParent);
        return fm_22;
    }

    public static fk_2 k() {
        return k;
    }

    public static Parser<fk_2> l() {
        return d;
    }

    public Parser<fk_2> getParserForType() {
        return d;
    }

    public fk_2 m() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fk_2 fk_22) {
        return fk_22.unknownFields;
    }
}

