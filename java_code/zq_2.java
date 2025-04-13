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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from zQ
 */
public final class zq_2
extends GeneratedMessageV3
implements zx_2 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    long g;
    public static final int b = 2;
    int h;
    public static final int c = 3;
    int i;
    private byte j = (byte)-1;
    private static final zq_2 k = new zq_2();
    @Deprecated
    public static final Parser<zq_2> d = new zr_2();

    zq_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zq_2() {
        this.g = 0L;
        this.h = 0;
        this.i = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zq_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.g = codedInputStream.readInt64();
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
        return zo_2.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zo_2.d.ensureFieldAccessorsInitialized(zq_2.class, zs_2.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public long c() {
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
        if (!this.d()) {
            this.j = 0;
            return false;
        }
        if (!this.f()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt64(1, this.g);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.g);
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
        if (!(object instanceof zq_2)) {
            return super.equals(object);
        }
        zq_2 zq_22 = (zq_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == zq_22.b();
        if (this.b()) {
            bl = bl && this.c() == zq_22.c();
        }
        boolean bl3 = bl = bl && this.d() == zq_22.d();
        if (this.d()) {
            bl = bl && this.e() == zq_22.e();
        }
        boolean bl4 = bl = bl && this.f() == zq_22.f();
        if (this.f()) {
            bl = bl && this.g() == zq_22.g();
        }
        bl = bl && this.unknownFields.equals((Object)zq_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zq_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
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

    public static zq_2 a(ByteBuffer byteBuffer) {
        return (zq_2)d.parseFrom(byteBuffer);
    }

    public static zq_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zq_2 a(ByteString byteString) {
        return (zq_2)d.parseFrom(byteString);
    }

    public static zq_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static zq_2 a(byte[] byArray) {
        return (zq_2)d.parseFrom(byArray);
    }

    public static zq_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static zq_2 a(InputStream inputStream) {
        return (zq_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static zq_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zq_2 b(InputStream inputStream) {
        return (zq_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static zq_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zq_2 a(CodedInputStream codedInputStream) {
        return (zq_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static zq_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zq_2)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zs_2 h() {
        return zq_2.i();
    }

    public static zs_2 i() {
        return k.j();
    }

    public static zs_2 a(zq_2 zq_22) {
        return k.j().a(zq_22);
    }

    public zs_2 j() {
        return this == k ? new zs_2() : new zs_2().a(this);
    }

    protected zs_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        zs_2 zs_22 = new zs_2(builderParent);
        return zs_22;
    }

    public static zq_2 k() {
        return k;
    }

    public static Parser<zq_2> l() {
        return d;
    }

    public Parser<zq_2> getParserForType() {
        return d;
    }

    public zq_2 m() {
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

    static /* synthetic */ UnknownFieldSet b(zq_2 zq_22) {
        return zq_22.unknownFields;
    }
}

