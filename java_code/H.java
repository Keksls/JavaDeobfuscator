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

public final class H
extends GeneratedMessageV3
implements p_0 {
    private static final long e = 0L;
    int f = 0;
    Object g;
    public static final int a = 1;
    long h;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private byte i = (byte)-1;
    private static final H j = new H();
    static final Parser<H> k = new i_0();

    H(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private H() {
        this.h = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    H(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                Object object;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block13;
                        bl2 = true;
                        continue block13;
                    }
                    case 8: {
                        this.h = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 16: {
                        this.f = 2;
                        this.g = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 26: {
                        object = codedInputStream.readStringRequireUtf8();
                        this.f = 3;
                        this.g = object;
                        continue block13;
                    }
                    case 34: 
                }
                object = null;
                if (this.f == 4) {
                    object = ((L)this.g).h();
                }
                this.g = codedInputStream.readMessage(L.j(), extensionRegistryLite);
                if (object != null) {
                    ((N)object).a((L)this.g);
                    this.g = ((N)object).i();
                }
                this.f = 4;
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
        return e_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.b.ensureFieldAccessorsInitialized(H.class, j_0.class);
    }

    @Override
    public K b() {
        return K.b(this.f);
    }

    @Override
    public long c() {
        return this.h;
    }

    @Override
    public long d() {
        if (this.f == 2) {
            return (Long)this.g;
        }
        return 0L;
    }

    @Override
    public String e() {
        Object object = "";
        if (this.f == 3) {
            object = this.g;
        }
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (this.f == 3) {
            this.g = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = "";
        if (this.f == 3) {
            object = this.g;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.f == 3) {
                this.g = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return this.f == 4;
    }

    @Override
    public L h() {
        if (this.f == 4) {
            return (L)this.g;
        }
        return L.i();
    }

    @Override
    public O i() {
        if (this.f == 4) {
            return (L)this.g;
        }
        return L.i();
    }

    public final boolean isInitialized() {
        byte by = this.i;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.i = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.h != 0L) {
            codedOutputStream.writeInt64(1, this.h);
        }
        if (this.f == 2) {
            codedOutputStream.writeInt64(2, ((Long)this.g).longValue());
        }
        if (this.f == 3) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.g);
        }
        if (this.f == 4) {
            codedOutputStream.writeMessage(4, (MessageLite)((L)this.g));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.h != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.h);
        }
        if (this.f == 2) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)((Long)this.g));
        }
        if (this.f == 3) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.g);
        }
        if (this.f == 4) {
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((L)this.g));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof H)) {
            return super.equals(object);
        }
        H h = (H)object;
        boolean bl = true;
        bl = bl && this.c() == h.c();
        boolean bl2 = bl = bl && this.b().equals((Object)h.b());
        if (!bl) {
            return false;
        }
        switch (this.f) {
            case 2: {
                bl = bl && this.d() == h.d();
                break;
            }
            case 3: {
                bl = bl && this.e().equals(h.e());
                break;
            }
            case 4: {
                bl = bl && this.h().equals(h.h());
                break;
            }
        }
        bl = bl && this.unknownFields.equals((Object)h.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + H.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.c());
        switch (this.f) {
            case 2: {
                n = 37 * n + 2;
                n = 53 * n + Internal.hashLong((long)this.d());
                break;
            }
            case 3: {
                n = 37 * n + 3;
                n = 53 * n + this.e().hashCode();
                break;
            }
            case 4: {
                n = 37 * n + 4;
                n = 53 * n + this.h().hashCode();
                break;
            }
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static H a(ByteBuffer byteBuffer) {
        return (H)k.parseFrom(byteBuffer);
    }

    public static H a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (H)k.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static H a(ByteString byteString) {
        return (H)k.parseFrom(byteString);
    }

    public static H a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (H)k.parseFrom(byteString, extensionRegistryLite);
    }

    public static H a(byte[] byArray) {
        return (H)k.parseFrom(byArray);
    }

    public static H a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (H)k.parseFrom(byArray, extensionRegistryLite);
    }

    public static H a(InputStream inputStream) {
        return (H)GeneratedMessageV3.parseWithIOException(k, (InputStream)inputStream);
    }

    public static H a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (H)GeneratedMessageV3.parseWithIOException(k, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static H b(InputStream inputStream) {
        return (H)GeneratedMessageV3.parseDelimitedWithIOException(k, (InputStream)inputStream);
    }

    public static H b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (H)GeneratedMessageV3.parseDelimitedWithIOException(k, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static H a(CodedInputStream codedInputStream) {
        return (H)GeneratedMessageV3.parseWithIOException(k, (CodedInputStream)codedInputStream);
    }

    public static H a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (H)GeneratedMessageV3.parseWithIOException(k, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public j_0 j() {
        return H.k();
    }

    public static j_0 k() {
        return j.l();
    }

    public static j_0 a(H h) {
        return j.l().a(h);
    }

    public j_0 l() {
        return this == j ? new j_0() : new j_0().a(this);
    }

    protected j_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        j_0 j_02 = new j_0(builderParent);
        return j_02;
    }

    public static H m() {
        return j;
    }

    public static Parser<H> n() {
        return k;
    }

    public Parser<H> getParserForType() {
        return k;
    }

    public H o() {
        return j;
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

    static /* synthetic */ UnknownFieldSet b(H h) {
        return h.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        H.checkByteStringIsUtf8((ByteString)byteString);
    }
}

