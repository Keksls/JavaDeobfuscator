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

public final class eO
extends GeneratedMessageV3
implements eR {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    int g;
    public static final int b = 2;
    List<eK> h;
    public static final int c = 4;
    int i;
    private byte j = (byte)-1;
    private static final eO k = new eO();
    @Deprecated
    public static final Parser<eO> d = new eP();

    eO(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eO() {
        this.g = 0;
        this.h = Collections.emptyList();
        this.i = -2;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block12;
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) != 2) {
                            this.h = new ArrayList<eK>();
                            n |= 2;
                        }
                        this.h.add((eK)codedInputStream.readMessage(eK.f, extensionRegistryLite));
                        continue block12;
                    }
                    case 32: 
                }
                this.f |= 2;
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
            if ((n & 2) == 2) {
                this.h = Collections.unmodifiableList(this.h);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return eI.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eI.b.ensureFieldAccessorsInitialized(eO.class, eQ.class);
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
    public List<eK> d() {
        return this.h;
    }

    @Override
    public List<? extends eN> e() {
        return this.h;
    }

    @Override
    public int f() {
        return this.h.size();
    }

    @Override
    public eK a(int n) {
        return this.h.get(n);
    }

    @Override
    public eN b(int n) {
        return this.h.get(n);
    }

    @Override
    public boolean g() {
        return (this.f & 2) == 2;
    }

    @Override
    public int h() {
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
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
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
        for (int k = 0; k < this.h.size(); ++k) {
            codedOutputStream.writeMessage(2, (MessageLite)this.h.get(k));
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeInt32(4, this.i);
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
        for (int k = 0; k < this.h.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.h.get(k)));
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eO)) {
            return super.equals(object);
        }
        eO eO2 = (eO)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == eO2.b();
        if (this.b()) {
            bl = bl && this.c() == eO2.c();
        }
        bl = bl && this.d().equals(eO2.d());
        boolean bl3 = bl = bl && this.g() == eO2.g();
        if (this.g()) {
            bl = bl && this.h() == eO2.h();
        }
        bl = bl && this.unknownFields.equals((Object)eO2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eO.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.f() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 4;
            n = 53 * n + this.h();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eO a(ByteBuffer byteBuffer) {
        return (eO)d.parseFrom(byteBuffer);
    }

    public static eO a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eO)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eO a(ByteString byteString) {
        return (eO)d.parseFrom(byteString);
    }

    public static eO a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eO)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static eO a(byte[] byArray) {
        return (eO)d.parseFrom(byArray);
    }

    public static eO a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eO)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static eO a(InputStream inputStream) {
        return (eO)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static eO a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eO)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eO b(InputStream inputStream) {
        return (eO)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static eO b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eO)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eO a(CodedInputStream codedInputStream) {
        return (eO)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static eO a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eO)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eQ i() {
        return eO.j();
    }

    public static eQ j() {
        return k.k();
    }

    public static eQ a(eO eO2) {
        return k.k().a(eO2);
    }

    public eQ k() {
        return this == k ? new eQ() : new eQ().a(this);
    }

    protected eQ a(GeneratedMessageV3.BuilderParent builderParent) {
        eQ eQ2 = new eQ(builderParent);
        return eQ2;
    }

    public static eO l() {
        return k;
    }

    public static Parser<eO> m() {
        return d;
    }

    public Parser<eO> getParserForType() {
        return d;
    }

    public eO n() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eO eO2) {
        return eO2.unknownFields;
    }
}

