import {
	CLEAR_ACTIVE_ITEM,
	CLEAR_DROP_TARGET,
	CLEAR_HOVERED_ITEM,
	UPDATE_ACTIVE_ITEM,
	UPDATE_DROP_TARGET,
	UPDATE_HIGHLIGHT_MAPPING_STATUS,
	UPDATE_HOVERED_ITEM
} from '../actions/actions.es';

/**
 * Fragments Editor item borders
 * @review
 * @type {!object}
 */
const FRAGMENTS_EDITOR_ITEM_BORDERS = {
	bottom: 'border-bottom',
	top: 'border-top'
};

/**
 * Fragments Editor item types
 * @review
 * @type {!object}
 */
const FRAGMENTS_EDITOR_ITEM_TYPES = {
	column: 'fragments-editor-column',
	fragment: 'fragments-editor-fragment',
	fragmentList: 'fragments-editor-fragment-list',
	section: 'fragments-editor-section'
};

/**
 * Updates active element data with the information sent.
 * @param {!object} state
 * @param {UPDATE_ACTIVE_ITEM} actionType
 * @param {!object} payload
 * @param {string} payload.activeItemId
 * @param {string} payload.activeItemType
 * @return {object}
 * @review
 */
function updateActiveItemReducer(state, actionType, payload) {
	let nextState = state;

	if (actionType === CLEAR_ACTIVE_ITEM) {
		nextState = Object.assign({}, nextState);
		nextState.activeItemId = null;
		nextState.activeItemType = null;
	}
	else if (actionType === UPDATE_ACTIVE_ITEM) {
		nextState = Object.assign({}, nextState);
		nextState.activeItemId = payload.activeItemId;
		nextState.activeItemType = payload.activeItemType;
	}

	return nextState;
}

/**
 * Updates drop target element with the information sent.
 * @param {!object} state
 * @param {CLEAR_DROP_TARGET|UPDATE_DROP_TARGET} actionType
 * @param {!object} payload
 * @param {string} payload.dropTargetBorder
 * @param {string} payload.dropTargetItemId
 * @param {string} payload.dropTargetItemType
 * @return {object}
 * @review
 */
function updateDropTargetReducer(state, actionType, payload) {
	let nextState = state;

	if (actionType === CLEAR_DROP_TARGET) {
		nextState = Object.assign({}, nextState);
		nextState.dropTargetBorder = null;
		nextState.dropTargetItemId = null;
		nextState.dropTargetItemType = null;
	}
	else if (actionType === UPDATE_DROP_TARGET) {
		nextState = Object.assign({}, nextState);
		nextState.dropTargetBorder = payload.dropTargetBorder;
		nextState.dropTargetItemId = payload.dropTargetItemId;
		nextState.dropTargetItemType = payload.dropTargetItemType;
	}

	return nextState;
}

/**
 * @param {!object} state
 * @param {!string} actionType
 * @param {object} payload
 * @param {bool} payload.highlightMapping
 * @return {object}
 * @review
 */
function updateHighlightMappingReducer(state, actionType, payload) {
	let nextState = state;

	if (actionType === UPDATE_HIGHLIGHT_MAPPING_STATUS) {
		nextState = Object.assign(
			{},
			nextState,
			{
				highlightMapping: Boolean(payload.highlightMapping)
			}
		);
	}

	return nextState;
}

/**
 * Updates hovered element data with the information sent.
 * @param {!object} state
 * @param {UPDATE_HOVERED_ITEM} actionType
 * @param {!object} payload
 * @param {string} payload.hoveredItemId
 * @param {string} payload.hoveredItemType
 * @return {object}
 * @review
 */
function updateHoveredItemReducer(state, actionType, payload) {
	let nextState = state;

	if (actionType === CLEAR_HOVERED_ITEM) {
		nextState = Object.assign({}, nextState);
		nextState.hoveredItemId = null;
		nextState.hoveredItemType = null;
	}
	else if (actionType === UPDATE_HOVERED_ITEM) {
		nextState = Object.assign({}, nextState);
		nextState.hoveredItemId = payload.hoveredItemId;
		nextState.hoveredItemType = payload.hoveredItemType;
	}

	return nextState;
}

export {
	FRAGMENTS_EDITOR_ITEM_BORDERS,
	FRAGMENTS_EDITOR_ITEM_TYPES,
	updateActiveItemReducer,
	updateDropTargetReducer,
	updateHighlightMappingReducer,
	updateHoveredItemReducer
};