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
 * Renamed from AK
 */
public final class ak_0
extends GeneratedMessageV3
implements an_0 {
    private static final long d = 0L;
    public static final int a = 1;
    List<Integer> e;
    public static final int b = 2;
    List<Integer> f;
    private byte g = (byte)-1;
    private static final ak_0 h = new ak_0();
    @Deprecated
    public static final Parser<ak_0> c = new al_0();

    ak_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ak_0() {
        this.e = Collections.emptyList();
        this.f = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ak_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2;
                int n3;
                int n4 = codedInputStream.readTag();
                switch (n4) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n4)) continue block13;
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        if ((n & 1) != 1) {
                            this.e = new ArrayList<Integer>();
                            n |= 1;
                        }
                        this.e.add(codedInputStream.readInt32());
                        continue block13;
                    }
                    case 10: {
                        n3 = codedInputStream.readRawVarint32();
                        n2 = codedInputStream.pushLimit(n3);
                        if ((n & 1) != 1 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.e = new ArrayList<Integer>();
                            n |= 1;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.e.add(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n2);
                        continue block13;
                    }
                    case 16: {
                        if ((n & 2) != 2) {
                            this.f = new ArrayList<Integer>();
                            n |= 2;
                        }
                        this.f.add(codedInputStream.readInt32());
                        continue block13;
                    }
                    case 18: 
                }
                n3 = codedInputStream.readRawVarint32();
                n2 = codedInputStream.pushLimit(n3);
                if ((n & 2) != 2 && codedInputStream.getBytesUntilLimit() > 0) {
                    this.f = new ArrayList<Integer>();
                    n |= 2;
                }
                while (codedInputStream.getBytesUntilLimit() > 0) {
                    this.f.add(codedInputStream.readInt32());
                }
                codedInputStream.popLimit(n2);
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (n & true) {
                this.e = Collections.unmodifiableList(this.e);
            }
            if ((n & 2) == 2) {
                this.f = Collections.unmodifiableList(this.f);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ai_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ai_0.b.ensureFieldAccessorsInitialized(ak_0.class, am_0.class);
    }

    @Override
    public List<Integer> b() {
        return this.e;
    }

    @Override
    public int c() {
        return this.e.size();
    }

    @Override
    public int a(int n) {
        return this.e.get(n);
    }

    @Override
    public List<Integer> d() {
        return this.f;
    }

    @Override
    public int e() {
        return this.f.size();
    }

    @Override
    public int b(int n) {
        return this.f.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.g;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.g = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.e.size(); ++n) {
            codedOutputStream.writeInt32(1, this.e.get(n).intValue());
        }
        for (n = 0; n < this.f.size(); ++n) {
            codedOutputStream.writeInt32(2, this.f.get(n).intValue());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        int n3 = 0;
        for (n = 0; n < this.e.size(); ++n) {
            n3 += CodedOutputStream.computeInt32SizeNoTag((int)this.e.get(n));
        }
        n2 += n3;
        n2 += 1 * this.b().size();
        n3 = 0;
        for (n = 0; n < this.f.size(); ++n) {
            n3 += CodedOutputStream.computeInt32SizeNoTag((int)this.f.get(n));
        }
        n2 += n3;
        n2 += 1 * this.d().size();
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ak_0)) {
            return super.equals(object);
        }
        ak_0 ak_02 = (ak_0)object;
        boolean bl = true;
        bl = bl && this.b().equals(ak_02.b());
        bl = bl && this.d().equals(ak_02.d());
        bl = bl && this.unknownFields.equals((Object)ak_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ak_0.a().hashCode();
        if (this.c() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.e() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ak_0 a(ByteBuffer byteBuffer) {
        return (ak_0)c.parseFrom(byteBuffer);
    }

    public static ak_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ak_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ak_0 a(ByteString byteString) {
        return (ak_0)c.parseFrom(byteString);
    }

    public static ak_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ak_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ak_0 a(byte[] byArray) {
        return (ak_0)c.parseFrom(byArray);
    }

    public static ak_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ak_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ak_0 a(InputStream inputStream) {
        return (ak_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ak_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ak_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ak_0 b(InputStream inputStream) {
        return (ak_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ak_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ak_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ak_0 a(CodedInputStream codedInputStream) {
        return (ak_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ak_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ak_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public am_0 f() {
        return ak_0.g();
    }

    public static am_0 g() {
        return h.h();
    }

    public static am_0 a(ak_0 ak_02) {
        return h.h().a(ak_02);
    }

    public am_0 h() {
        return this == h ? new am_0() : new am_0().a(this);
    }

    protected am_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        am_0 am_02 = new am_0(builderParent);
        return am_02;
    }

    public static ak_0 i() {
        return h;
    }

    public static Parser<ak_0> j() {
        return c;
    }

    public Parser<ak_0> getParserForType() {
        return c;
    }

    public ak_0 k() {
        return h;
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

    static /* synthetic */ UnknownFieldSet b(ak_0 ak_02) {
        return ak_02.unknownFields;
    }
}

