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
 * Renamed from me
 */
public final class me_0
extends GeneratedMessageV3.Builder<me_0>
implements mf_0 {
    private int a;
    private List<mg_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<mg_0, mi_0, mj_0> c;

    public static final Descriptors.Descriptor a() {
        return ma_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ma_0.b.ensureFieldAccessorsInitialized(mc_0.class, me_0.class);
    }

    me_0() {
        this.m();
    }

    me_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (mc_0.k()) {
            this.o();
        }
    }

    public me_0 e() {
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
        return ma_0.a;
    }

    public mc_0 f() {
        return mc_0.h();
    }

    public mc_0 g() {
        mc_0 mc_02 = this.h();
        if (!mc_02.isInitialized()) {
            throw me_0.newUninitializedMessageException((Message)mc_02);
        }
        return mc_02;
    }

    public mc_0 h() {
        mc_0 mc_02 = new mc_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            mc_02.d = this.b;
        } else {
            mc_02.d = this.c.build();
        }
        this.onBuilt();
        return mc_02;
    }

    public me_0 i() {
        return (me_0)super.clone();
    }

    public me_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (me_0)super.setField(fieldDescriptor, object);
    }

    public me_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (me_0)super.clearField(fieldDescriptor);
    }

    public me_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (me_0)super.clearOneof(oneofDescriptor);
    }

    public me_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (me_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public me_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (me_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public me_0 a(Message message) {
        if (message instanceof mc_0) {
            return this.a((mc_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public me_0 a(mc_0 mc_02) {
        if (mc_02 == mc_0.h()) {
            return this;
        }
        if (this.c == null) {
            if (!mc_02.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = mc_02.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(mc_02.d);
                }
                this.onChanged();
            }
        } else if (!mc_02.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = mc_02.d;
                this.a &= 0xFFFFFFFE;
                this.c = mc_0.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(mc_02.d);
            }
        }
        this.b(mc_0.b(mc_02));
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

    public me_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mc_0 mc_02 = null;
        try {
            mc_02 = (mc_0)mc_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mc_02 = (mc_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mc_02 != null) {
                this.a(mc_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<mg_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<mg_0> b() {
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
    public mg_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (mg_0)this.c.getMessage(n);
    }

    public me_0 a(int n, mg_0 mg_02) {
        if (this.c == null) {
            if (mg_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, mg_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)mg_02);
        }
        return this;
    }

    public me_0 a(int n, mi_0 mi_02) {
        if (this.c == null) {
            this.n();
            this.b.set(n, mi_02.z());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)mi_02.z());
        }
        return this;
    }

    public me_0 a(mg_0 mg_02) {
        if (this.c == null) {
            if (mg_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(mg_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)mg_02);
        }
        return this;
    }

    public me_0 b(int n, mg_0 mg_02) {
        if (this.c == null) {
            if (mg_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, mg_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)mg_02);
        }
        return this;
    }

    public me_0 a(mi_0 mi_02) {
        if (this.c == null) {
            this.n();
            this.b.add(mi_02.z());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)mi_02.z());
        }
        return this;
    }

    public me_0 b(int n, mi_0 mi_02) {
        if (this.c == null) {
            this.n();
            this.b.add(n, mi_02.z());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)mi_02.z());
        }
        return this;
    }

    public me_0 a(Iterable<? extends mg_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public me_0 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public me_0 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public mi_0 d(int n) {
        return (mi_0)this.o().getBuilder(n);
    }

    @Override
    public mj_0 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (mj_0)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends mj_0> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public mi_0 k() {
        return (mi_0)this.o().addBuilder((AbstractMessage)mg_0.A());
    }

    public mi_0 e(int n) {
        return (mi_0)this.o().addBuilder(n, (AbstractMessage)mg_0.A());
    }

    public List<mi_0> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<mg_0, mi_0, mj_0> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final me_0 a(UnknownFieldSet unknownFieldSet) {
        return (me_0)super.setUnknownFields(unknownFieldSet);
    }

    public final me_0 b(UnknownFieldSet unknownFieldSet) {
        return (me_0)super.mergeUnknownFields(unknownFieldSet);
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

