/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from BI
 */
public final class bi_0
extends GeneratedMessageV3.Builder<bi_0>
implements bp_0 {
    private int a;
    private List<bl_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<bl_0, BN, BO> c;

    public static final Descriptors.Descriptor a() {
        return AO.o;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.p.ensureFieldAccessorsInitialized(BG.class, bi_0.class);
    }

    bi_0() {
        this.m();
    }

    bi_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (BG.k()) {
            this.o();
        }
    }

    public bi_0 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return AO.o;
    }

    public BG f() {
        return BG.h();
    }

    public BG g() {
        BG bG = this.h();
        if (!bG.isInitialized()) {
            throw bi_0.newUninitializedMessageException((Message)bG);
        }
        return bG;
    }

    public BG h() {
        BG bG = new BG(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            bG.d = this.b;
        } else {
            bG.d = this.c.build();
        }
        this.onBuilt();
        return bG;
    }

    public bi_0 i() {
        return (bi_0)super.clone();
    }

    public bi_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bi_0)super.setField(fieldDescriptor, object);
    }

    public bi_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bi_0)super.clearField(fieldDescriptor);
    }

    public bi_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bi_0)super.clearOneof(oneofDescriptor);
    }

    public bi_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bi_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bi_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bi_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public bi_0 a(Message message) {
        if (message instanceof BG) {
            return this.a((BG)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bi_0 a(BG bG) {
        if (bG == BG.h()) {
            return this;
        }
        if (this.c == null) {
            if (!bG.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = bG.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(bG.d);
                }
                this.onChanged();
            }
        } else if (!bG.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = bG.d;
                this.a &= 0xFFFFFFFE;
                this.c = BG.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(bG.d);
            }
        }
        this.b(BG.b(bG));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public bi_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        BG bG = null;
        try {
            bG = (BG)BG.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bG = (BG)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bG != null) {
                this.a(bG);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<bl_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<bl_0> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public bl_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (bl_0)this.c.getMessage(n);
    }

    public bi_0 a(int n, bl_0 bl_02) {
        if (this.c == null) {
            if (bl_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, bl_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)bl_02);
        }
        return this;
    }

    public bi_0 a(int n, BN bN) {
        if (this.c == null) {
            this.n();
            this.b.set(n, bN.t());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)bN.t());
        }
        return this;
    }

    public bi_0 a(bl_0 bl_02) {
        if (this.c == null) {
            if (bl_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(bl_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)bl_02);
        }
        return this;
    }

    public bi_0 b(int n, bl_0 bl_02) {
        if (this.c == null) {
            if (bl_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, bl_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)bl_02);
        }
        return this;
    }

    public bi_0 a(BN bN) {
        if (this.c == null) {
            this.n();
            this.b.add(bN.t());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)bN.t());
        }
        return this;
    }

    public bi_0 b(int n, BN bN) {
        if (this.c == null) {
            this.n();
            this.b.add(n, bN.t());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)bN.t());
        }
        return this;
    }

    public bi_0 a(Iterable<? extends bl_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public bi_0 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public bi_0 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public BN d(int n) {
        return (BN)this.o().getBuilder(n);
    }

    @Override
    public BO b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (BO)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends BO> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public BN k() {
        return (BN)this.o().addBuilder((AbstractMessage)bl_0.u());
    }

    public BN e(int n) {
        return (BN)this.o().addBuilder(n, (AbstractMessage)bl_0.u());
    }

    public List<BN> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<bl_0, BN, BO> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final bi_0 a(UnknownFieldSet unknownFieldSet) {
        return (bi_0)super.setUnknownFields(unknownFieldSet);
    }

    public final bi_0 b(UnknownFieldSet unknownFieldSet) {
        return (bi_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

