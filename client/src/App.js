import React from 'react';
import { Provider } from 'react-redux';
import { store } from "./redux/store";
import { Navigator } from "./pages/navigator";

export const App = () => {
	return (
		<Provider
			store={store}
		>
			<Navigator/>
		</Provider>
	)
};
