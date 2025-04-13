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
 * Renamed from gV
 */
public final class gv_0
extends GeneratedMessageV3.Builder<gv_0>
implements ha_0 {
    private int a;
    private List<gw_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<gw_0, gy_0, gz_0> c;

    public static final Descriptors.Descriptor a() {
        return gn_1.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gn_1.d.ensureFieldAccessorsInitialized(gt_0.class, gv_0.class);
    }

    gv_0() {
        this.m();
    }

    gv_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (gt_0.k()) {
            this.o();
        }
    }

    public gv_0 e() {
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
        return gn_1.c;
    }

    public gt_0 f() {
        return gt_0.h();
    }

    public gt_0 g() {
        gt_0 gt_02 = this.h();
        if (!gt_02.isInitialized()) {
            throw gv_0.newUninitializedMessageException((Message)gt_02);
        }
        return gt_02;
    }

    public gt_0 h() {
        gt_0 gt_02 = new gt_0(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            gt_02.d = this.b;
        } else {
            gt_02.d = this.c.build();
        }
        this.onBuilt();
        return gt_02;
    }

    public gv_0 i() {
        return (gv_0)super.clone();
    }

    public gv_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gv_0)super.setField(fieldDescriptor, object);
    }

    public gv_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gv_0)super.clearField(fieldDescriptor);
    }

    public gv_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gv_0)super.clearOneof(oneofDescriptor);
    }

    public gv_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gv_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gv_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gv_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public gv_0 a(Message message) {
        if (message instanceof gt_0) {
            return this.a((gt_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gv_0 a(gt_0 gt_02) {
        if (gt_02 == gt_0.h()) {
            return this;
        }
        if (this.c == null) {
            if (!gt_02.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = gt_02.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(gt_02.d);
                }
                this.onChanged();
            }
        } else if (!gt_02.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = gt_02.d;
                this.a &= 0xFFFFFFFE;
                this.c = gt_0.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(gt_02.d);
            }
        }
        this.b(gt_0.b(gt_02));
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

    public gv_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gt_0 gt_02 = null;
        try {
            gt_02 = (gt_0)gt_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gt_02 = (gt_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gt_02 != null) {
                this.a(gt_02);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<gw_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<gw_0> b() {
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
    public gw_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (gw_0)this.c.getMessage(n);
    }

    public gv_0 a(int n, gw_0 gw_02) {
        if (this.c == null) {
            if (gw_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, gw_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)gw_02);
        }
        return this;
    }

    public gv_0 a(int n, gy_0 gy_02) {
        if (this.c == null) {
            this.n();
            this.b.set(n, gy_02.i());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)gy_02.i());
        }
        return this;
    }

    public gv_0 a(gw_0 gw_02) {
        if (this.c == null) {
            if (gw_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(gw_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)gw_02);
        }
        return this;
    }

    public gv_0 b(int n, gw_0 gw_02) {
        if (this.c == null) {
            if (gw_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, gw_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)gw_02);
        }
        return this;
    }

    public gv_0 a(gy_0 gy_02) {
        if (this.c == null) {
            this.n();
            this.b.add(gy_02.i());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)gy_02.i());
        }
        return this;
    }

    public gv_0 b(int n, gy_0 gy_02) {
        if (this.c == null) {
            this.n();
            this.b.add(n, gy_02.i());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)gy_02.i());
        }
        return this;
    }

    public gv_0 a(Iterable<? extends gw_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public gv_0 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public gv_0 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public gy_0 d(int n) {
        return (gy_0)this.o().getBuilder(n);
    }

    @Override
    public gz_0 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (gz_0)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends gz_0> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public gy_0 k() {
        return (gy_0)this.o().addBuilder((AbstractMessage)gw_0.j());
    }

    public gy_0 e(int n) {
        return (gy_0)this.o().addBuilder(n, (AbstractMessage)gw_0.j());
    }

    public List<gy_0> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<gw_0, gy_0, gz_0> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final gv_0 a(UnknownFieldSet unknownFieldSet) {
        return (gv_0)super.setUnknownFields(unknownFieldSet);
    }

    public final gv_0 b(UnknownFieldSet unknownFieldSet) {
        return (gv_0)super.mergeUnknownFields(unknownFieldSet);
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

