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
 * Renamed from ds
 */
public final class ds_2
extends GeneratedMessageV3
implements dv_1 {
    private static final long f = 0L;
    int g;
    public static final int a = 1;
    int h;
    public static final int b = 2;
    int i;
    public static final int c = 3;
    int j;
    public static final int d = 4;
    int k;
    private byte l = (byte)-1;
    private static final ds_2 m = new ds_2();
    @Deprecated
    public static final Parser<ds_2> e = new dt_1();

    ds_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ds_2() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ds_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block13;
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.g |= 1;
                        this.h = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 16: {
                        this.g |= 2;
                        this.i = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 24: {
                        this.g |= 4;
                        this.j = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 32: 
                }
                this.g |= 8;
                this.k = codedInputStream.readInt32();
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
        return dn_1.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.h.ensureFieldAccessorsInitialized(ds_2.class, du_1.class);
    }

    @Override
    public boolean b() {
        return (this.g & 1) == 1;
    }

    @Override
    public int c() {
        return this.h;
    }

    @Override
    public boolean d() {
        return (this.g & 2) == 2;
    }

    @Override
    public int e() {
        return this.i;
    }

    @Override
    public boolean f() {
        return (this.g & 4) == 4;
    }

    @Override
    public int g() {
        return this.j;
    }

    @Override
    public boolean h() {
        return (this.g & 8) == 8;
    }

    @Override
    public int i() {
        return this.k;
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.g & 1) == 1) {
            codedOutputStream.writeInt32(1, this.h);
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeInt32(2, this.i);
        }
        if ((this.g & 4) == 4) {
            codedOutputStream.writeInt32(3, this.j);
        }
        if ((this.g & 8) == 8) {
            codedOutputStream.writeInt32(4, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.g & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.h);
        }
        if ((this.g & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.i);
        }
        if ((this.g & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.j);
        }
        if ((this.g & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.k);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ds_2)) {
            return super.equals(object);
        }
        ds_2 ds_22 = (ds_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ds_22.b();
        if (this.b()) {
            bl = bl && this.c() == ds_22.c();
        }
        boolean bl3 = bl = bl && this.d() == ds_22.d();
        if (this.d()) {
            bl = bl && this.e() == ds_22.e();
        }
        boolean bl4 = bl = bl && this.f() == ds_22.f();
        if (this.f()) {
            bl = bl && this.g() == ds_22.g();
        }
        boolean bl5 = bl = bl && this.h() == ds_22.h();
        if (this.h()) {
            bl = bl && this.i() == ds_22.i();
        }
        bl = bl && this.unknownFields.equals((Object)ds_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ds_2.a().hashCode();
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
        if (this.h()) {
            n = 37 * n + 4;
            n = 53 * n + this.i();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ds_2 a(ByteBuffer byteBuffer) {
        return (ds_2)e.parseFrom(byteBuffer);
    }

    public static ds_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ds_2)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ds_2 a(ByteString byteString) {
        return (ds_2)e.parseFrom(byteString);
    }

    public static ds_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ds_2)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static ds_2 a(byte[] byArray) {
        return (ds_2)e.parseFrom(byArray);
    }

    public static ds_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ds_2)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static ds_2 a(InputStream inputStream) {
        return (ds_2)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static ds_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ds_2)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ds_2 b(InputStream inputStream) {
        return (ds_2)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static ds_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ds_2)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ds_2 a(CodedInputStream codedInputStream) {
        return (ds_2)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static ds_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ds_2)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public du_1 j() {
        return ds_2.k();
    }

    public static du_1 k() {
        return m.l();
    }

    public static du_1 a(ds_2 ds_22) {
        return m.l().a(ds_22);
    }

    public du_1 l() {
        return this == m ? new du_1() : new du_1().a(this);
    }

    protected du_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        du_1 du_12 = new du_1(builderParent);
        return du_12;
    }

    public static ds_2 m() {
        return m;
    }

    public static Parser<ds_2> n() {
        return e;
    }

    public Parser<ds_2> getParserForType() {
        return e;
    }

    public ds_2 o() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ds_2 ds_22) {
        return ds_22.unknownFields;
    }
}

