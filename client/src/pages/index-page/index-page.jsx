import React from 'react';
import { connect } from 'react-redux';
import { LocaleAction } from "../../redux/actions/locale-action";

class Component extends React.Component {

	render() {
		return (
			<React.Fragment>
				{this.props.LocaleReducer.strings["welcome"]}
			</React.Fragment>
		);
	}

	componentDidMount() {
		this.props.dispatch(LocaleAction.set("en"));
		this.props.dispatch(LocaleAction.load("en", require("./locale-en")));
	}

}

export const IndexPage = connect((store) => {
	return {
		LocaleReducer: {
			strings: store.LocaleReducer.strings
		}
	};
})(Component);
