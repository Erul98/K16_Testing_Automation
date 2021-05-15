// Copyright (c) 2015-present Mattermost, Inc. All Rights Reserved.
// See LICENSE.txt for license information.

import React from 'react';
import {shallow, ShallowWrapper} from 'enzyme';

import {NotificationLevels} from 'utils/constants';

import UnmuteChannelButton from './unmute_channel_button';

describe('components/ChannelHeaderMobile/UnmuteChannelButton', () => {
    const baseProps = {
        user: {
            id: 'user_id',
        },
        channel: {
            id: 'channel_id',
        },
        actions: {
            updateChannelNotifyProps: jest.fn(),
        },
    };

    it('should match snapshot', () => {
        const wrapper: ShallowWrapper<any, any, UnmuteChannelButton> = shallow(<UnmuteChannelButton {...baseProps}/>);

        expect(wrapper).toMatchSnapshot();
    });

    it('should runs updateChannelNotifyProps on click', () => {
        const props = baseProps;
        props.actions.updateChannelNotifyProps = jest.fn();

        const wrapper: ShallowWrapper<any, any, UnmuteChannelButton> = shallow(<UnmuteChannelButton {...props}/>);
        wrapper.simulate('click');

        expect(props.actions.updateChannelNotifyProps).toBeCalledWith(
            props.user.id,
            props.channel.id,
            {mark_unread: NotificationLevels.ALL},
        );
    });
});
