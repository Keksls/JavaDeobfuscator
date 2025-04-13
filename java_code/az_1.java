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
 * Renamed from az
 */
public final class az_1
extends GeneratedMessageV3
implements ac_2 {
    private static final long c = 0L;
    public static final int a = 1;
    int d;
    public static final int b = 2;
    av_2 e;
    private byte f = (byte)-1;
    private static final az_1 g = new az_1();
    static final Parser<az_1> h = new aa_2();

    az_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private az_1() {
        this.d = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    az_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.d = codedInputStream.readInt32();
                        continue block11;
                    }
                    case 18: 
                }
                ax_1 ax_12 = null;
                if (this.e != null) {
                    ax_12 = this.e.f();
                }
                this.e = (av_2)codedInputStream.readMessage(av_2.h(), extensionRegistryLite);
                if (ax_12 == null) continue;
                ax_12.a(this.e);
                this.e = ax_12.g();
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
        return ao_2.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ao_2.f.ensureFieldAccessorsInitialized(az_1.class, ab_2.class);
    }

    @Override
    public int b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return this.e != null;
    }

    @Override
    public av_2 d() {
        return this.e == null ? av_2.g() : this.e;
    }

    @Override
    public ay_2 e() {
        return this.d();
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.d != 0) {
            codedOutputStream.writeInt32(1, this.d);
        }
        if (this.e != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.d());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.d != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.d);
        }
        if (this.e != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.d());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof az_1)) {
            return super.equals(object);
        }
        az_1 az_12 = (az_1)object;
        boolean bl = true;
        bl = bl && this.b() == az_12.b();
        boolean bl2 = bl = bl && this.c() == az_12.c();
        if (this.c()) {
            bl = bl && this.d().equals(az_12.d());
        }
        bl = bl && this.unknownFields.equals((Object)az_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + az_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.b();
        if (this.c()) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static az_1 a(ByteBuffer byteBuffer) {
        return (az_1)h.parseFrom(byteBuffer);
    }

    public static az_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (az_1)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static az_1 a(ByteString byteString) {
        return (az_1)h.parseFrom(byteString);
    }

    public static az_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (az_1)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static az_1 a(byte[] byArray) {
        return (az_1)h.parseFrom(byArray);
    }

    public static az_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (az_1)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static az_1 a(InputStream inputStream) {
        return (az_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static az_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (az_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static az_1 b(InputStream inputStream) {
        return (az_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static az_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (az_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static az_1 a(CodedInputStream codedInputStream) {
        return (az_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static az_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (az_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ab_2 f() {
        return az_1.g();
    }

    public static ab_2 g() {
        return g.h();
    }

    public static ab_2 a(az_1 az_12) {
        return g.h().a(az_12);
    }

    public ab_2 h() {
        return this == g ? new ab_2() : new ab_2().a(this);
    }

    protected ab_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        ab_2 ab_22 = new ab_2(builderParent);
        return ab_22;
    }

    public static az_1 i() {
        return g;
    }

    public static Parser<az_1> j() {
        return h;
    }

    public Parser<az_1> getParserForType() {
        return h;
    }

    public az_1 k() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(az_1 az_12) {
        return az_12.unknownFields;
    }
}

